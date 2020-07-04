package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ClazzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClazzExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andClazzidIsNull() {
            addCriterion("clazzid is null");
            return (Criteria) this;
        }

        public Criteria andClazzidIsNotNull() {
            addCriterion("clazzid is not null");
            return (Criteria) this;
        }

        public Criteria andClazzidEqualTo(Integer value) {
            addCriterion("clazzid =", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidNotEqualTo(Integer value) {
            addCriterion("clazzid <>", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidGreaterThan(Integer value) {
            addCriterion("clazzid >", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clazzid >=", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidLessThan(Integer value) {
            addCriterion("clazzid <", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidLessThanOrEqualTo(Integer value) {
            addCriterion("clazzid <=", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidIn(List<Integer> values) {
            addCriterion("clazzid in", values, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidNotIn(List<Integer> values) {
            addCriterion("clazzid not in", values, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidBetween(Integer value1, Integer value2) {
            addCriterion("clazzid between", value1, value2, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidNotBetween(Integer value1, Integer value2) {
            addCriterion("clazzid not between", value1, value2, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazznameIsNull() {
            addCriterion("clazzname is null");
            return (Criteria) this;
        }

        public Criteria andClazznameIsNotNull() {
            addCriterion("clazzname is not null");
            return (Criteria) this;
        }

        public Criteria andClazznameEqualTo(String value) {
            addCriterion("clazzname =", value, "clazzname");
            return (Criteria) this;
        }

        public Criteria andClazznameNotEqualTo(String value) {
            addCriterion("clazzname <>", value, "clazzname");
            return (Criteria) this;
        }

        public Criteria andClazznameGreaterThan(String value) {
            addCriterion("clazzname >", value, "clazzname");
            return (Criteria) this;
        }

        public Criteria andClazznameGreaterThanOrEqualTo(String value) {
            addCriterion("clazzname >=", value, "clazzname");
            return (Criteria) this;
        }

        public Criteria andClazznameLessThan(String value) {
            addCriterion("clazzname <", value, "clazzname");
            return (Criteria) this;
        }

        public Criteria andClazznameLessThanOrEqualTo(String value) {
            addCriterion("clazzname <=", value, "clazzname");
            return (Criteria) this;
        }

        public Criteria andClazznameLike(String value) {
            addCriterion("clazzname like", value, "clazzname");
            return (Criteria) this;
        }

        public Criteria andClazznameNotLike(String value) {
            addCriterion("clazzname not like", value, "clazzname");
            return (Criteria) this;
        }

        public Criteria andClazznameIn(List<String> values) {
            addCriterion("clazzname in", values, "clazzname");
            return (Criteria) this;
        }

        public Criteria andClazznameNotIn(List<String> values) {
            addCriterion("clazzname not in", values, "clazzname");
            return (Criteria) this;
        }

        public Criteria andClazznameBetween(String value1, String value2) {
            addCriterion("clazzname between", value1, value2, "clazzname");
            return (Criteria) this;
        }

        public Criteria andClazznameNotBetween(String value1, String value2) {
            addCriterion("clazzname not between", value1, value2, "clazzname");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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