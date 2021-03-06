package com.qtone.wxq.eye.store.mysql.presist.model;

import java.util.Date;

public class AnnotationEntry {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column annotation.id
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column annotation.key
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    private String key;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column annotation.value
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column annotation.ip
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column annotation.port
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    private String port;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column annotation.time
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column annotation.span_Id
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    private String spanId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column annotation.trace_Id
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    private String traceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column annotation.type
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    private Integer type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column annotation.id
     *
     * @return the value of annotation.id
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column annotation.id
     *
     * @param id the value for annotation.id
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column annotation.key
     *
     * @return the value of annotation.key
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public String getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column annotation.key
     *
     * @param key the value for annotation.key
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column annotation.value
     *
     * @return the value of annotation.value
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column annotation.value
     *
     * @param value the value for annotation.value
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column annotation.ip
     *
     * @return the value of annotation.ip
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column annotation.ip
     *
     * @param ip the value for annotation.ip
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column annotation.port
     *
     * @return the value of annotation.port
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public String getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column annotation.port
     *
     * @param port the value for annotation.port
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column annotation.time
     *
     * @return the value of annotation.time
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column annotation.time
     *
     * @param time the value for annotation.time
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column annotation.span_Id
     *
     * @return the value of annotation.span_Id
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public String getSpanId() {
        return spanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column annotation.span_Id
     *
     * @param spanId the value for annotation.span_Id
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public void setSpanId(String spanId) {
        this.spanId = spanId == null ? null : spanId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column annotation.trace_Id
     *
     * @return the value of annotation.trace_Id
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column annotation.trace_Id
     *
     * @param traceId the value for annotation.trace_Id
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId == null ? null : traceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column annotation.type
     *
     * @return the value of annotation.type
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column annotation.type
     *
     * @param type the value for annotation.type
     *
     * @mbggenerated Wed Feb 22 10:44:00 CST 2017
     */
    public void setType(Integer type) {
        this.type = type;
    }
}