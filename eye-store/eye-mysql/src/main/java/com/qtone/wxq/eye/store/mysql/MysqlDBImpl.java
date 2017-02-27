package com.qtone.wxq.eye.store.mysql;

import com.qtone.wxq.eye.store.mysql.services.SpanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by gaozhicheng on 2017/2/27.
 */
@Repository("mysqlDBImpl")
public class MysqlDBImpl {

    @Autowired(required = false)
    private SpanService spanService ;



}
