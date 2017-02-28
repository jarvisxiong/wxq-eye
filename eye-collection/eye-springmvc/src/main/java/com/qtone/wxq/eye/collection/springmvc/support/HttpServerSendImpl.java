package com.qtone.wxq.eye.collection.springmvc.support;

import com.qtone.wxq.eye.core.factory.IServerSendFactory;
import com.qtone.wxq.eye.core.factory.IStoreFactory;
import com.qtone.wxq.eye.core.gen.EyeConfig;
import com.qtone.wxq.eye.core.gen.create.CreateAnnotation;
import com.qtone.wxq.eye.core.gen.dto.Span;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by gaozhicheng on 2017/2/27.
 */
@Repository("httpServerSendImpl")
public class HttpServerSendImpl implements IServerSendFactory {

    private final Logger logger = LoggerFactory.getLogger(HttpServerSendImpl.class);

    @Autowired(required = false)
    private IStoreFactory storeMysqlImpl;

    @Override
    public void handle(Object request) {

        Date now = new Date();

        HttpServletRequest req = transHttpRequest(request);
        if (req == null) {
            logger.info("非法请求request");
            return;
        }
        Span span = (Span) req.getAttribute(HttpServerReceiveImpl.HTTP_ATTRIBUTE_SPAN_INFO);

        this.setSpanAnnotation(span, req.getRemoteHost(), req.getRemotePort(), now);

        storeMysqlImpl.saveSpanAnno(span);

        EyeConfig.clearCurrentSpan();

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
     * 设置span的固定sr annotation参数
     *
     * @param span
     * @param host
     * @param port
     * @param nowTime
     */
    private void setSpanAnnotation(Span span, String host, int port, Date nowTime) {
        CreateAnnotation.ssAnnotation(span, host, port, nowTime);
    }
}
