package com.qtone.wxq.eye.store.mysql.presist.model;

public class TraceEntry {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace.id
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace.trace_Id
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    private String traceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace.total_time
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    private Long totalTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace.trace_Name
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    private String traceName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trace.id
     *
     * @return the value of trace.id
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trace.id
     *
     * @param id the value for trace.id
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trace.trace_Id
     *
     * @return the value of trace.trace_Id
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trace.trace_Id
     *
     * @param traceId the value for trace.trace_Id
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId == null ? null : traceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trace.total_time
     *
     * @return the value of trace.total_time
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    public Long getTotalTime() {
        return totalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trace.total_time
     *
     * @param totalTime the value for trace.total_time
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trace.trace_Name
     *
     * @return the value of trace.trace_Name
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    public String getTraceName() {
        return traceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trace.trace_Name
     *
     * @param traceName the value for trace.trace_Name
     *
     * @mbggenerated Wed Feb 22 10:29:21 CST 2017
     */
    public void setTraceName(String traceName) {
        this.traceName = traceName == null ? null : traceName.trim();
    }
}