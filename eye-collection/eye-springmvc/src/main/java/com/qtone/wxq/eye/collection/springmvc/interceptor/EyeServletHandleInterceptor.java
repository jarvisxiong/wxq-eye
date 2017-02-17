package com.qtone.wxq.eye.collection.springmvc.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by gaozhicheng on 2017/2/17.
 */
public class EyeServletHandleInterceptor extends HandlerInterceptorAdapter {

    private static final String HTTP_SERVLET_SERVICE_NAME = EyeServletHandleInterceptor.class.getName()+".service-name";

    /**
     * 当前拦截器处理前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getAttribute(HTTP_SERVLET_SERVICE_NAME)!=null ) return true ;//已经处理

        //构造Span
        //存储到数据库

        return false ;
    }

    /**
     * 当前拦截器处理后
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    /**
     * 所有拦截器处理完后
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
