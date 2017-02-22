package com.qtone.wxq.eye.core.gen;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gaozhicheng on 2017/2/17.
 */
public class Span implements Serializable{

    private String traceId;
    private String spanId;
    private String parentSpanId; //optional
    private List<Annotation> annotations; //固定参数
    private List<BinaryAnnotation> binaryAnnotations; //额外参数

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getParentSpanId() {
        return parentSpanId;
    }

    public void setParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
    }

    public List<Annotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    public List<BinaryAnnotation> getBinaryAnnotations() {
        return binaryAnnotations;
    }

    public void setBinaryAnnotations(List<BinaryAnnotation> binaryAnnotations) {
        this.binaryAnnotations = binaryAnnotations;
    }
}
