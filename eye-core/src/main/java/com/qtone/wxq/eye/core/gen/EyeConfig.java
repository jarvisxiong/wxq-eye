package com.qtone.wxq.eye.core.gen;

import com.qtone.wxq.eye.core.gen.dto.Span;

/**
 * Created by gaozhicheng on 2017/2/22.
 */
public class EyeConfig {

    public static final String traceName = "default-service" ;

    private String ipport;

    private static final ThreadLocal<Span> currentSpan  = new ThreadLocal<Span>();

    public String getIpport() {
        return ipport;
    }

    public void setIpport(String ipport) {
        this.ipport = ipport;
    }

    public static Span getCurrentSpan() {
        return currentSpan.get();
    }

    public static void setCurrentSpan(Span currentSpan) {
        EyeConfig.currentSpan.set(currentSpan);
    }

    public static void clearCurrentSpan(){
        EyeConfig.currentSpan.remove();
    }
}
