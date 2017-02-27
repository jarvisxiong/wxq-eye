package com.qtone.wxq.eye.collection.springmvc.interceptor;

import com.qtone.wxq.eye.core.adapter.ServerReceiveAdapter;
import com.qtone.wxq.eye.core.adapter.ServerSendAdapter;
import com.qtone.wxq.eye.core.gen.EyeConfig;
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

    @Autowired(required = false)
    private ServerReceiveAdapter httpServerReceiveAdapter  ;

    @Autowired(required = false)
    private ServerSendAdapter serverSendAdapter ;


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

        httpServerReceiveAdapter.handle(request);

        return true ;
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


        serverSendAdapter.handle(request);

        EyeConfig.clearCurrentSpan();
    }
}
