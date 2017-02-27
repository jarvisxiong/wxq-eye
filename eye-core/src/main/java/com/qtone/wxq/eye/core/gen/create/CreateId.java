package com.qtone.wxq.eye.core.gen.create;

/**
 * Created by gaozhicheng on 2017/2/22.
 */
public class CreateId {

    public static String genSpanId(){
        return CreateId.SpanId.create().getSpanId();
    }

    public static String genTraceId(){
        return CreateId.TraceId.create().getTraceId();
    }

    static class SpanId {

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
            String spanId = String.valueOf("spanId_"+System.currentTimeMillis());
            return new SpanId(spanId);
        }
    }

    static class TraceId {

        private String traceId;

        public String getTraceId() {
            return traceId;
        }

        public void setTraceId(String traceId) {
            this.traceId = traceId;
        }

        public TraceId(String traceId) {
            this.traceId = traceId;
        }

        public static TraceId create() {
            String traceId = String.valueOf("traceId_"+System.currentTimeMillis());
            return new TraceId(traceId);
        }
    }
}
