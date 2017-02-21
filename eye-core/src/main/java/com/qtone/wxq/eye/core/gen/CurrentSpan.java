package com.qtone.wxq.eye.core.gen;

import com.qtone.wxq.eye.core.gen.Span;

/**
 * Created by gaozhicheng on 2017/2/21.
 */
public class CurrentSpan {

    public static ThreadLocal<Span> currentSpan = new ThreadLocal<Span>();
}
