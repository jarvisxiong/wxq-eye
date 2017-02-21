package com.qtone.wxq.eye.core.gen.create;

/**
 * Created by gaozhicheng on 2017/2/21.
 */
public class SpanId {

    private String spanId;

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public SpanId(String spanId) {
        this.spanId = spanId;
    }

    public static SpanId create() {
        String spanId = String.valueOf(System.currentTimeMillis());
        return new SpanId(spanId);
    }
}
