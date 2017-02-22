package com.qtone.wxq.eye.core.gen;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by gaozhicheng on 2017/2/17.
 */
public class Annotation implements Serializable {
    public static final String CLIENT_SEND = "cs";
    public static final String CLIENT_RECEIVE = "cr";
    public static final String SERVER_SEND = "ss";
    public static final String SERVER_RECEIVE = "sr";
    private Date time;
    private String value;
    private Endpoint host;
    private int type = 0; //固定信息

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Annotation)) return false;

        Annotation that = (Annotation) o;

        if (type != that.type) return false;
        if (getTime() != null ? !getTime().equals(that.getTime()) : that.getTime() != null) return false;
        if (getValue() != null ? !getValue().equals(that.getValue()) : that.getValue() != null) return false;
        if (getHost() != null ? !getHost().equals(that.getHost()) : that.getHost() != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getTime() != null ? getTime().hashCode() : 0;
        result = 31 * result + (getValue() != null ? getValue().hashCode() : 0);
        result = 31 * result + (getHost() != null ? getHost().hashCode() : 0);
        result = 31 * result + type;
        return result;
    }

    public Annotation() {

    }

    public Annotation(Date time, String value, Endpoint host) {
        this.time = time;
        this.value = value;
        this.host = host;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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
}
