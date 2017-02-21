package com.qtone.wxq.eye.core.adapter;

/**
 * Created by gaozhicheng on 2017/2/21.
 */

import com.qtone.wxq.eye.core.gen.TraceData;

/**
 * ss(服务端接收)适配器
 */
public interface ServerReceiveAdapter {

    TraceData getHeader(Object request);

}
