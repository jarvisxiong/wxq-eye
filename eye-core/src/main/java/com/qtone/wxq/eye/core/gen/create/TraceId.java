package com.qtone.wxq.eye.core.gen.create;

/**
 * Created by gaozhicheng on 2017/2/21.
 */
public class TraceId {

    private String traceId ;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public TraceId(String traceId) {
        this.traceId = traceId;
    }

    public static TraceId create(){
        String traceId = String.valueOf(System.currentTimeMillis());
        return new TraceId(traceId);
    }
}
