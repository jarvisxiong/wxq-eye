package com.qtone.wxq.eye.core.gen;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by gaozhicheng on 2017/2/17.
 */
public class BinaryAnnotation implements Serializable {
    private String key;
    private String value;
    private Endpoint host;
    private Date time;
    private int type = 1; //额外信息

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Endpoint getHost() {
        return host;
    }

    public void setHost(Endpoint host) {
        this.host = host;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
