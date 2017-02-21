package com.qtone.wxq.eye.core.gen.Constant;

/**
 * Created by gaozhicheng on 2017/2/18.
 */
public enum EyeHttpHeaderValue {

    TraceId("X-B3-TraceId"),

    SpanId("X-B3-SpanId"),

    ParentSpanId("X-B3-ParentSpanId"),

    Sampled("X-B3-Sampled");

    private final String name;

    EyeHttpHeaderValue(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
