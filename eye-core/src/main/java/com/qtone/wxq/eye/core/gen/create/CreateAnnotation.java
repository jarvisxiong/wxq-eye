package com.qtone.wxq.eye.core.gen.create;

import com.qtone.wxq.eye.core.gen.dto.Annotation;
import com.qtone.wxq.eye.core.gen.dto.BinaryAnnotation;
import com.qtone.wxq.eye.core.gen.dto.Endpoint;
import com.qtone.wxq.eye.core.gen.dto.Span;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by gaozhicheng on 2017/2/22.
 */
public class CreateAnnotation {

    /**
     * 构建sr 参数
     */
    public static void srAnnotation(Span span, String ip, Integer port, Date time) {
        Annotation anno = new Annotation();
        anno.setTime(time);
        anno.setValue(Annotation.SERVER_RECEIVE);
        Endpoint endpoint = new Endpoint();
        endpoint.setIp(ip);
        endpoint.setPort(Integer.valueOf(port));
        anno.setHost(endpoint);
        span.addAnnotation(anno);
    }

    /**
     * 构建ss 参数
     */
    public static void ssAnnotation(Span span, String ip, Integer port, Date time) {
        Annotation anno = new Annotation();
        anno.setTime(time);
        anno.setValue(Annotation.SERVER_SEND);
        Endpoint endpoint = new Endpoint();
        endpoint.setIp(ip);
        endpoint.setPort(Integer.valueOf(port));
        anno.setHost(endpoint);
        span.addAnnotation(anno);
    }

    public static void srBinaryAnnotation(Span span, String ip, Integer port, Date time, Map<String, String> mapValue) {
        if (mapValue == null) {
            return;
        }
        Endpoint endpoint = new Endpoint();
        endpoint.setIp(ip);
        endpoint.setPort(Integer.valueOf(port));
        Set<Map.Entry<String, String>> entrySet = mapValue.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            BinaryAnnotation binaryAnno = new BinaryAnnotation();
            binaryAnno.setHost(endpoint);
            binaryAnno.setTime(time);
            binaryAnno.setKey(next.getKey());
            binaryAnno.setValue(next.getValue());
            span.addBinaryAnnotation(binaryAnno);
        }
    }


}
