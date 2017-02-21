package com.qtone.wxq.eye.store.mysql;

import com.qtone.wxq.eye.store.mysql.presist.model.SpanEntry;
import com.qtone.wxq.eye.store.mysql.services.SpanService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gaozhicheng on 2017/2/21.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/service.xml");
        SpanService spanServiceImpl = (SpanService) ac.getBean("spanServiceImpl");
        SpanEntry entry = new SpanEntry();
        spanServiceImpl.create(entry);
    }

}
