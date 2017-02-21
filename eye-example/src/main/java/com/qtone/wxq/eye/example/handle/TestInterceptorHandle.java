package com.qtone.wxq.eye.example.handle;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by gaozhicheng on 2017/2/18.
 */
@Controller
@RequestMapping("interceptor")
public class TestInterceptorHandle {

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(TestInterceptorHandle.class);

    @RequestMapping("test")
    @ResponseBody
    public String test(HttpServletResponse response){
        logger.info("test interceptor");
        return "success" ;
    }

    @RequestMapping("sendredirect")
    public void sendredirect(){
        logger.info("sendredirect");
    }
}
