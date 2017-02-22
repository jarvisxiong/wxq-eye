package com.qtone.wxq.eye.store.mysql.services.impl;

import com.qtone.wxq.eye.store.mysql.presist.mapping.SpanEntryMapper;
import com.qtone.wxq.eye.store.mysql.presist.model.SpanEntry;
import com.qtone.wxq.eye.store.mysql.services.SpanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gaozhicheng on 2017/2/17.
 */
@Service
public class SpanServiceImpl implements SpanService {

    private static Logger logger = LoggerFactory.getLogger(SpanServiceImpl.class);

    @Autowired(required = false)
    private SpanEntryMapper spanEntryMapper;

    @Override
    public long create(SpanEntry entry) {
        try {
            return spanEntryMapper.insert(entry);
        } catch (Exception e) {
            logger.error("Span插入失败", e);
        }
        return 0;
    }

    @Override
    public SpanEntry get(long primaryKeyId) {
        try {
            return spanEntryMapper.selectByPrimaryKey(primaryKeyId);
        } catch (Exception e) {
            logger.error("获取Span失败 id:" + primaryKeyId, e);
        }
        return null;
    }

}
