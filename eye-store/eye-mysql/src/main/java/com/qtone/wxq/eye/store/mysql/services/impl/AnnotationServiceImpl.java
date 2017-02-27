package com.qtone.wxq.eye.store.mysql.services.impl;

import com.qtone.wxq.eye.store.mysql.presist.mapping.AnnotationEntryMapper;
import com.qtone.wxq.eye.store.mysql.presist.model.AnnotationEntry;
import com.qtone.wxq.eye.store.mysql.services.AnnotationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gaozhicheng on 2017/2/17.
 */
@Service
public class AnnotationServiceImpl implements AnnotationService {

    private static Logger logger = LoggerFactory.getLogger(AnnotationServiceImpl.class);

    @Autowired(required = false)
    private AnnotationEntryMapper annotationEntryMapper;

    @Override
    public long create(AnnotationEntry entry) {
        try {
            return annotationEntryMapper.insert(entry);
        } catch (Exception e) {
            logger.error("Annotation插入失败", e);
        }
        return 0;
    }

    @Override
    public AnnotationEntry get(long primaryKeyId) {
        try {
            return annotationEntryMapper.selectByPrimaryKey(primaryKeyId);
        } catch (Exception e) {
            logger.error("Annotation id:" + primaryKeyId, e);
        }
        return null;
    }

}
