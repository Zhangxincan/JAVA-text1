package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuidIsNull() {
            addCriterion("stuid is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuid =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuid <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuid >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuid >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuid <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuid <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuid in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuid not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuid between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuid not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuname is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuname is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuname =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuname <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuname >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuname >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuname <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuname <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuname like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuname not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuname in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuname not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuname between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuname not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStuageIsNull() {
            addCriterion("stuage is null");
            return (Criteria) this;
        }

        public Criteria andStuageIsNotNull() {
            addCriterion("stuage is not null");
            return (Criteria) this;
        }

        public Criteria andStuageEqualTo(Integer value) {
            addCriterion("stuage =", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotEqualTo(Integer value) {
            addCriterion("stuage <>", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageGreaterThan(Integer value) {
            addCriterion("stuage >", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuage >=", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageLessThan(Integer value) {
            addCriterion("stuage <", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageLessThanOrEqualTo(Integer value) {
            addCriterion("stuage <=", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageIn(List<Integer> values) {
            addCriterion("stuage in", values, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotIn(List<Integer> values) {
            addCriterion("stuage not in", values, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageBetween(Integer value1, Integer value2) {
            addCriterion("stuage between", value1, value2, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotBetween(Integer value1, Integer value2) {
            addCriterion("stuage not between", value1, value2, "stuage");
            return (Criteria) this;
        }

        public Criteria andClidIsNull() {
            addCriterion("clid is null");
            return (Criteria) this;
        }

        public Criteria andClidIsNotNull() {
            addCriterion("clid is not null");
            return (Criteria) this;
        }

        public Criteria andClidEqualTo(Integer value) {
            addCriterion("clid =", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidNotEqualTo(Integer value) {
            addCriterion("clid <>", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidGreaterThan(Integer value) {
            addCriterion("clid >", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clid >=", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidLessThan(Integer value) {
            addCriterion("clid <", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidLessThanOrEqualTo(Integer value) {
            addCriterion("clid <=", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidIn(List<Integer> values) {
            addCriterion("clid in", values, "clid");
            return (Criteria) this;
        }

        public Criteria andClidNotIn(List<Integer> values) {
            addCriterion("clid not in", values, "clid");
            return (Criteria) this;
        }

        public Criteria andClidBetween(Integer value1, Integer value2) {
            addCriterion("clid between", value1, value2, "clid");
            return (Criteria) this;
        }

        public Criteria andClidNotBetween(Integer value1, Integer value2) {
            addCriterion("clid not between", value1, value2, "clid");
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