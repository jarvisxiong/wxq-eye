package com.qtone.wxq.eye.collection.springmvc.support;

import com.qtone.wxq.eye.core.adapter.ServerReceiveAdapter;
import com.qtone.wxq.eye.core.gen.Constant.EyeHttpHeaderValue;
import com.qtone.wxq.eye.core.gen.TraceData;
import com.qtone.wxq.eye.core.gen.create.SpanId;
import com.qtone.wxq.eye.core.gen.create.TraceId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by gaozhicheng on 2017/2/21.
 */

public class HttpServerReceiveAdapter implements ServerReceiveAdapter {

    private static final Logger logger = LoggerFactory.getLogger(HttpServerReceiveAdapter.class);

    /**
     * 获取http Header 头信息
     *
     * @param request
     * @return
     */
    @Override
    public TraceData getHeader(Object request) {
        HttpServletRequest req = null;
        try {
            req = (HttpServletRequest) request;
        } catch (Exception e) {
            logger.error("HttpServletRequest转换异常", e);
            return new TraceData(null, null);
        }
        logger.info("获取http Header 信息");
        String sampled = req.getHeader(EyeHttpHeaderValue.Sampled.getName());
        String spanId = req.getHeader(EyeHttpHeaderValue.SpanId.getName());
        String parentSpanId = req.getHeader(EyeHttpHeaderValue.ParentSpanId.getName());
        String traceId = req.getHeader(EyeHttpHeaderValue.TraceId.getName());
        Boolean parseSample = sampled != null ? sampled.equalsIgnoreCase("1") || sampled.equalsIgnoreCase("true") ? true : false : true;
        TraceData trace = null;
        if (spanId != null && traceId != null) {
            trace = new TraceData(parseSample, traceId, parentSpanId, spanId);
        } else {
            trace = new TraceData(true, TraceId.create().getTraceId(), null, SpanId.create().getSpanId());
        }
        return trace;

    }
}
