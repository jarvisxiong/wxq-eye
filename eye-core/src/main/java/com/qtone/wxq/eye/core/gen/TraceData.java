package com.qtone.wxq.eye.core.gen;

/**
 * Created by gaozhicheng on 2017/2/21.
 */
public class TraceData {

    private String spanId;
    private String traceId;
    private String parentSpanId;

    public TraceData() {
    }

    public TraceData(String spanId) {
        this.spanId = spanId;
    }

    public TraceData(String traceId, String parentSpanId, String spanId) {
        this.traceId = traceId;
        this.parentSpanId = parentSpanId;
        this.spanId = spanId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getParentSpanId() {
        return parentSpanId;
    }

    public void setParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
    }

}
