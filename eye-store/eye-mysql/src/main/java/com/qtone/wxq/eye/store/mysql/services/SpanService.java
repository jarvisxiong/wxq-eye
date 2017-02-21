package com.qtone.wxq.eye.store.mysql.services;

import com.qtone.wxq.eye.store.mysql.presist.model.SpanEntry;

/**
 * Created by gaozhicheng on 2017/2/17.
 */
public interface SpanService {

    /**
     * 创建实体信息，并返回对应的 主键id
     * @param entry
     * @return
     */
    public long create(SpanEntry entry) ;

    /**
     *
     * 根据主键信息获取对应的实体信息
     * @param primaryKeyId
     * @return
     *
     */
    public SpanEntry get(long primaryKeyId) ;


}
