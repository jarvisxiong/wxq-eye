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

    public Long getTraceId() {
        return traceId;
    }

    public void setTraceId(Long traceId) {
        this.traceId = traceId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getSpanName() {
        return spanName;
    }

    public void setSpanName(String spanName) {
        this.spanName = spanName;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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

    public boolean isSample() {
        return isSample;
    }

    public void setSample(boolean sample) {
        isSample = sample;
    }

    @Override
    public String toString() {
        return "Span{" +
                "traceId=" + traceId +
                ", id=" + id +
                ", parentId=" + parentId +
                ", spanName='" + spanName + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", annotations=" + annotations +
                ", binaryAnnotations=" + binaryAnnotations +
                ", isSample=" + isSample +
                '}';
    }
}
