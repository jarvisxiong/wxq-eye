package com.qtone.wxq.eye.collection.springmvc.support;

import com.qtone.wxq.eye.core.adapter.ServerReceiveAdapter;
import com.qtone.wxq.eye.core.adapter.support.MysqlDBImpl;
import com.qtone.wxq.eye.core.gen.EyeConfig;
import com.qtone.wxq.eye.core.gen.constant.EyeHttpHeaderValue;
import com.qtone.wxq.eye.core.gen.create.CreateAnnotation;
import com.qtone.wxq.eye.core.gen.create.CreateId;
import com.qtone.wxq.eye.core.gen.dto.Endpoint;
import com.qtone.wxq.eye.core.gen.dto.Span;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by gaozhicheng on 2017/2/21.
 */
@Repository("httpServerReceiveAdapter")
public class HttpServerReceiveAdapter implements ServerReceiveAdapter {

    public static final String HTTP_ATTRIBUTE_SPAN_INFO = "SPAN_INFO_ATTRIBITE_REQUEST_";

    private static final Logger logger = LoggerFactory.getLogger(HttpServerReceiveAdapter.class);

    @Autowired(required = false)
    private MysqlDBImpl mysqlDBImpl ;

    @Override
    public void handle(Object request) {
        Date now = new Date();
        EyeConfig.clearCurrentSpan();

        HttpServletRequest req = transHttpRequest(request);
        if (req == null ){
            logger.info("非法请求request");
            return  ;
        }
        Span span = getHeader(req);

        EyeConfig.setCurrentSpan(span);

        req.setAttribute(HTTP_ATTRIBUTE_SPAN_INFO,span);

        setSpanAnnotation(span, req.getRemoteHost(), req.getRemotePort(), now);

        setSpanBinaryAnnotations(span, req.getRemoteHost(), req.getRemotePort(), now);

//        mysqlDBImpl.saveDB(span);

    }

    /**
     * 设置 sr 的 额外annotation参数
     *
     * @param span
     * @param host
     * @param port
     * @param now
     */
    private void setSpanBinaryAnnotations(Span span, String host, int port, Date now) {
        Endpoint endpoint = new Endpoint();
        endpoint.setIp(host);
        endpoint.setPort(port);
        CreateAnnotation.srBinaryAnnotation(span, endpoint, now, null);
    }

    /**
     * 转换成HttpServletRequest
     *
     * @param request
     * @return
     */
    private HttpServletRequest transHttpRequest(Object request) {
        HttpServletRequest req = null;
        try {
            req = (HttpServletRequest) request;
        } catch (Exception e) {
            logger.error("[ sr ] : HttpServletRequest转换异常", e);
        }
        return req;
    }

    /**
     * 获取http Header 头信息
     *
     * @param request
     * @return
     */
    private Span getHeader(HttpServletRequest request) {
        logger.info("[ sr ] : 获取http Header 信息");
        String spanId = request.getHeader(EyeHttpHeaderValue.SpanId.getName());
        String parentSpanId = request.getHeader(EyeHttpHeaderValue.ParentSpanId.getName());
        String traceId = request.getHeader(EyeHttpHeaderValue.TraceId.getName());
        Span span = null;
        if (spanId != null && traceId != null) {
            span = Span.genSpan(traceId, spanId, CreateId.genSpanId(), request.getMethod());
        } else {//root span
            logger.info("[ sr ] : 生成 root span ");
            span = Span.rootSpan(CreateId.genTraceId(), CreateId.genSpanId(), request.getMethod());
        }
        return span;

    }

    /**
     * 设置span的固定sr annotation参数
     *
     * @param span
     * @param host
     * @param port
     * @param nowTime
     */
    private void setSpanAnnotation(Span span, String host, int port, Date nowTime) {
        Endpoint endpoint = new Endpoint();
        endpoint.setIp(host);
        endpoint.setPort(port);
        CreateAnnotation.srAnnotation(span, endpoint, nowTime);
    }


}
