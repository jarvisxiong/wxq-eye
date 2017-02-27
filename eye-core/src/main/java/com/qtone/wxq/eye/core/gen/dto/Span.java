package com.qtone.wxq.eye.core.gen.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaozhicheng on 2017/2/17.
 */
public class Span implements Serializable {

    private String traceId;
    private String spanId;
    private String parentSpanId; //optional
    private String spanName;
    private List<Annotation> annotations; //固定参数
    private List<BinaryAnnotation> binaryAnnotations; //额外参数

    //根据上游生成新span
    public static Span genSpan(String traceId, String parentSpanId, String newSpanId, String spanName) {
        Span span = new Span();
        span.parentSpanId = parentSpanId ;
        span.spanId = newSpanId ;
        span.traceId = traceId ;
        span.spanName = spanName ;
        span.annotations = new ArrayList<Annotation>();
        span.binaryAnnotations = new ArrayList<BinaryAnnotation>();
        return span;
    }

    //生成root span
    public static Span rootSpan(String traceId, String spanId, String spanName) {
        Span span = new Span();
        span.spanId = spanId ;
        span.traceId = traceId ;
        span.spanName = spanName ;
        span.annotations = new ArrayList<Annotation>();
        span.binaryAnnotations = new ArrayList<BinaryAnnotation>();
        return span;
    }

    public String getTraceId() {
        return traceId;
    }

    public String getSpanId() {
        return spanId;
    }

    public String getParentSpanId() {
        return parentSpanId;
    }

    public List<Annotation> getAnnotations() {
        return annotations;
    }

    public List<BinaryAnnotation> getBinaryAnnotations() {
        return binaryAnnotations;
    }

    public String getSpanName() {
        return spanName;
    }

    public void addAnnotation(Annotation anno){
        this.annotations.add(anno);
    }

    public void addBinaryAnnotation(BinaryAnnotation binaryAnno){
        this.binaryAnnotations.add(binaryAnno);
    }
}
