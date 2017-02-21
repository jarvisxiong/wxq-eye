package com.qtone.wxq.eye.collection.springmvc.interceptor;

import com.qtone.wxq.eye.collection.springmvc.support.HttpServerReceiveAdapter;
import com.qtone.wxq.eye.core.adapter.ServerReceiveAdapter;
import com.qtone.wxq.eye.core.gen.CurrentSpan;
import com.qtone.wxq.eye.core.gen.Span;
import com.qtone.wxq.eye.core.gen.TraceData;
import com.qtone.wxq.eye.store.mysql.presist.model.SpanEntry;
import com.qtone.wxq.eye.store.mysql.services.SpanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by gaozhicheng on 2017/2/17.
 */
public class EyeServletHandleInterceptor extends HandlerInterceptorAdapter {

    private static Logger logger = LoggerFactory.getLogger(EyeServletHandleInterceptor.class);

    private ServerReceiveAdapter serverReceiveAdapter  = new HttpServerReceiveAdapter();

    @Autowired(required = false)
    private SpanService spanService ;
    /**
     * 方法处理前
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        logger.info("preHandle " + " entry");
        //从header中获取span信息
        TraceData header = serverReceiveAdapter.getHeader(request);
        //存入threadLocal中
        Span span = new Span();
        span.setTraceId(Long.valueOf(header.getTraceId()));
        span.setSample(header.getSampled());
        span.setId(Long.valueOf(header.getSpanId()));
        if (header.getParentSpanId()==null) span.setParentId(null);
        else span.setParentId(Long.valueOf(header.getParentSpanId()));
        CurrentSpan.currentSpan.set(span);
        //存入mysql
        SpanEntry entry = new SpanEntry();
        entry.setParentid(span.getParentId());
        entry.setSpanid(span.getId());
        entry.setTraceid(span.getTraceId());
        spanService.create(entry);
        return true;
    }

    /**
     * 方法完全处理后，渲染后
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        CurrentSpan.currentSpan.remove();
    }
}
