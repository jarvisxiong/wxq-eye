package com.qtone.wxq.eye.store.mysql.services.impl;

import com.qtone.wxq.eye.store.mysql.presist.mapping.TraceEntryMapper;
import com.qtone.wxq.eye.store.mysql.presist.model.TraceEntry;
import com.qtone.wxq.eye.store.mysql.services.TraceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gaozhicheng on 2017/2/17.
 */
@Service
public class TraceServiceImpl implements TraceService {

    private static Logger logger = LoggerFactory.getLogger(TraceServiceImpl.class);

    @Autowired(required = false)
    private TraceEntryMapper traceEntryMapper;

    @Override
    public long create(TraceEntry entry) {
        try {
            return traceEntryMapper.insert(entry);
        } catch (Exception e) {
            logger.error("Trace插入失败", e);
        }
        return 0;
    }

    @Override
    public TraceEntry get(long primaryKeyId) {
        try {
            return traceEntryMapper.selectByPrimaryKey(primaryKeyId);
        } catch (Exception e) {
            logger.error("获取Trace失败 id:" + primaryKeyId, e);
        }
        return null;
    }

}
