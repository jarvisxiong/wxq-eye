package com.qtone.wxq.eye.store.mysql.presist.model;

import java.util.ArrayList;
import java.util.List;

public class SpanEntryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    public SpanEntryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("span.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("span.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("span.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("span.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("span.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("span.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("span.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("span.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("span.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("span.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("span.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("span.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTraceidIsNull() {
            addCriterion("span.traceId is null");
            return (Criteria) this;
        }

        public Criteria andTraceidIsNotNull() {
            addCriterion("span.traceId is not null");
            return (Criteria) this;
        }

        public Criteria andTraceidEqualTo(String value) {
            addCriterion("span.traceId =", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotEqualTo(String value) {
            addCriterion("span.traceId <>", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidGreaterThan(String value) {
            addCriterion("span.traceId >", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidGreaterThanOrEqualTo(String value) {
            addCriterion("span.traceId >=", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidLessThan(String value) {
            addCriterion("span.traceId <", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidLessThanOrEqualTo(String value) {
            addCriterion("span.traceId <=", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidLike(String value) {
            addCriterion("span.traceId like", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotLike(String value) {
            addCriterion("span.traceId not like", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidIn(List<String> values) {
            addCriterion("span.traceId in", values, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotIn(List<String> values) {
            addCriterion("span.traceId not in", values, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidBetween(String value1, String value2) {
            addCriterion("span.traceId between", value1, value2, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotBetween(String value1, String value2) {
            addCriterion("span.traceId not between", value1, value2, "traceid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("span.parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("span.parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("span.parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("span.parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("span.parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("span.parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("span.parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("span.parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("span.parentId like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("span.parentId not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("span.parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("span.parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("span.parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("span.parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andSpanidIsNull() {
            addCriterion("span.spanId is null");
            return (Criteria) this;
        }

        public Criteria andSpanidIsNotNull() {
            addCriterion("span.spanId is not null");
            return (Criteria) this;
        }

        public Criteria andSpanidEqualTo(String value) {
            addCriterion("span.spanId =", value, "spanid");
            return (Criteria) this;
        }

        public Criteria andSpanidNotEqualTo(String value) {
            addCriterion("span.spanId <>", value, "spanid");
            return (Criteria) this;
        }

        public Criteria andSpanidGreaterThan(String value) {
            addCriterion("span.spanId >", value, "spanid");
            return (Criteria) this;
        }

        public Criteria andSpanidGreaterThanOrEqualTo(String value) {
            addCriterion("span.spanId >=", value, "spanid");
            return (Criteria) this;
        }

        public Criteria andSpanidLessThan(String value) {
            addCriterion("span.spanId <", value, "spanid");
            return (Criteria) this;
        }

        public Criteria andSpanidLessThanOrEqualTo(String value) {
            addCriterion("span.spanId <=", value, "spanid");
            return (Criteria) this;
        }

        public Criteria andSpanidLike(String value) {
            addCriterion("span.spanId like", value, "spanid");
            return (Criteria) this;
        }

        public Criteria andSpanidNotLike(String value) {
            addCriterion("span.spanId not like", value, "spanid");
            return (Criteria) this;
        }

        public Criteria andSpanidIn(List<String> values) {
            addCriterion("span.spanId in", values, "spanid");
            return (Criteria) this;
        }

        public Criteria andSpanidNotIn(List<String> values) {
            addCriterion("span.spanId not in", values, "spanid");
            return (Criteria) this;
        }

        public Criteria andSpanidBetween(String value1, String value2) {
            addCriterion("span.spanId between", value1, value2, "spanid");
            return (Criteria) this;
        }

        public Criteria andSpanidNotBetween(String value1, String value2) {
            addCriterion("span.spanId not between", value1, value2, "spanid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table span
     *
     * @mbggenerated do_not_delete_during_merge Wed Feb 22 10:19:41 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table span
     *
     * @mbggenerated Wed Feb 22 10:19:41 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}