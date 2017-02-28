package com.qtone.wxq.eye.core.factory.support;

import com.qtone.wxq.eye.core.factory.IStoreFactory;
import com.qtone.wxq.eye.core.gen.EyeConfig;
import com.qtone.wxq.eye.core.gen.dto.Annotation;
import com.qtone.wxq.eye.core.gen.dto.BinaryAnnotation;
import com.qtone.wxq.eye.core.gen.dto.Span;
import com.qtone.wxq.eye.store.mysql.presist.model.AnnotationEntry;
import com.qtone.wxq.eye.store.mysql.presist.model.SpanEntry;
import com.qtone.wxq.eye.store.mysql.presist.model.TraceEntry;
import com.qtone.wxq.eye.store.mysql.services.AnnotationService;
import com.qtone.wxq.eye.store.mysql.services.SpanService;
import com.qtone.wxq.eye.store.mysql.services.TraceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by gaozhicheng on 2017/2/27.
 */
@Repository("storeMysqlImpl")
public class StoreMysqlImpl implements IStoreFactory {

    private static Logger logger = LoggerFactory.getLogger(StoreMysqlImpl.class);

    @Autowired(required = false)
    private SpanService spanService;

    @Autowired(required = false)
    private AnnotationService annotationService;

    @Autowired(required = false)
    private TraceService traceService;


    public void saveSpanAnno(Span span) {
        if (span != null) {
            if (span.getParentSpanId() != null && span.getParentSpanId().length() > 0) {

            }else {//root span
                logger.info("[root span, 创建新trace ]");
                TraceEntry traceEntry = new TraceEntry();
                traceEntry.setTraceId(span.getTraceId());
                traceEntry.setTraceName(EyeConfig.traceName);
                traceService.create(traceEntry);
            }
            logger.info("[ span, 创建新span ]");
            SpanEntry spanEntry = new SpanEntry();
            spanEntry.setSpanName(span.getSpanName());
            spanEntry.setSpanId(span.getSpanId());
            spanEntry.setTraceId(span.getTraceId());
            spanEntry.setParentSpanId(span.getParentSpanId());
            spanService.create(spanEntry);

            logger.info("[ annotation, 创建新annotation ]");

            for (Annotation anno :  span.getAnnotations()){
                AnnotationEntry annotationEntry = new AnnotationEntry();
                annotationEntry.setTraceId(span.getTraceId());
                annotationEntry.setSpanId(span.getSpanId());
                annotationEntry.setIp(anno.getHost().getIp());
                annotationEntry.setPort(anno.getHost().getPort().toString());
                annotationEntry.setTime(anno.getTime());
                annotationEntry.setValue(anno.getValue());
                annotationEntry.setType(anno.getType());
                annotationService.create(annotationEntry);
            }
            logger.info("[ binary annotation, 创建新binary annotation ]");
            for (BinaryAnnotation binaryAnno :  span.getBinaryAnnotations()){
                AnnotationEntry annotationEntry = new AnnotationEntry();
                annotationEntry.setTraceId(span.getTraceId());
                annotationEntry.setSpanId(span.getSpanId());
                annotationEntry.setIp(binaryAnno.getHost().getIp());
                annotationEntry.setPort(binaryAnno.getHost().getPort().toString());
                annotationEntry.setTime(binaryAnno.getTime());
                annotationEntry.setKey(binaryAnno.getKey());
                annotationEntry.setValue(binaryAnno.getValue());
                annotationEntry.setType(binaryAnno.getType());
                annotationService.create(annotationEntry);
            }

        } else {
            logger.info("[span为null,无法插入数据库]");
        }


    }


}
