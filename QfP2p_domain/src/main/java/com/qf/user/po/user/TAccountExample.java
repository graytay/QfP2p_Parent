package com.qf.user.po.user;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAccountExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPaypassIsNull() {
            addCriterion("paypass is null");
            return (Criteria) this;
        }

        public Criteria andPaypassIsNotNull() {
            addCriterion("paypass is not null");
            return (Criteria) this;
        }

        public Criteria andPaypassEqualTo(String value) {
            addCriterion("paypass =", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassNotEqualTo(String value) {
            addCriterion("paypass <>", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassGreaterThan(String value) {
            addCriterion("paypass >", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassGreaterThanOrEqualTo(String value) {
            addCriterion("paypass >=", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassLessThan(String value) {
            addCriterion("paypass <", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassLessThanOrEqualTo(String value) {
            addCriterion("paypass <=", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassLike(String value) {
            addCriterion("paypass like", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassNotLike(String value) {
            addCriterion("paypass not like", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassIn(List<String> values) {
            addCriterion("paypass in", values, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassNotIn(List<String> values) {
            addCriterion("paypass not in", values, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassBetween(String value1, String value2) {
            addCriterion("paypass between", value1, value2, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassNotBetween(String value1, String value2) {
            addCriterion("paypass not between", value1, value2, "paypass");
            return (Criteria) this;
        }

        public Criteria andUsebalanceIsNull() {
            addCriterion("usebalance is null");
            return (Criteria) this;
        }

        public Criteria andUsebalanceIsNotNull() {
            addCriterion("usebalance is not null");
            return (Criteria) this;
        }

        public Criteria andUsebalanceEqualTo(BigDecimal value) {
            addCriterion("usebalance =", value, "usebalance");
            return (Criteria) this;
        }

        public Criteria andUsebalanceNotEqualTo(BigDecimal value) {
            addCriterion("usebalance <>", value, "usebalance");
            return (Criteria) this;
        }

        public Criteria andUsebalanceGreaterThan(BigDecimal value) {
            addCriterion("usebalance >", value, "usebalance");
            return (Criteria) this;
        }

        public Criteria andUsebalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("usebalance >=", value, "usebalance");
            return (Criteria) this;
        }

        public Criteria andUsebalanceLessThan(BigDecimal value) {
            addCriterion("usebalance <", value, "usebalance");
            return (Criteria) this;
        }

        public Criteria andUsebalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("usebalance <=", value, "usebalance");
            return (Criteria) this;
        }

        public Criteria andUsebalanceIn(List<BigDecimal> values) {
            addCriterion("usebalance in", values, "usebalance");
            return (Criteria) this;
        }

        public Criteria andUsebalanceNotIn(List<BigDecimal> values) {
            addCriterion("usebalance not in", values, "usebalance");
            return (Criteria) this;
        }

        public Criteria andUsebalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usebalance between", value1, value2, "usebalance");
            return (Criteria) this;
        }

        public Criteria andUsebalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usebalance not between", value1, value2, "usebalance");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceIsNull() {
            addCriterion("frostbalance is null");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceIsNotNull() {
            addCriterion("frostbalance is not null");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceEqualTo(BigDecimal value) {
            addCriterion("frostbalance =", value, "frostbalance");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceNotEqualTo(BigDecimal value) {
            addCriterion("frostbalance <>", value, "frostbalance");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceGreaterThan(BigDecimal value) {
            addCriterion("frostbalance >", value, "frostbalance");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frostbalance >=", value, "frostbalance");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceLessThan(BigDecimal value) {
            addCriterion("frostbalance <", value, "frostbalance");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frostbalance <=", value, "frostbalance");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceIn(List<BigDecimal> values) {
            addCriterion("frostbalance in", values, "frostbalance");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceNotIn(List<BigDecimal> values) {
            addCriterion("frostbalance not in", values, "frostbalance");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frostbalance between", value1, value2, "frostbalance");
            return (Criteria) this;
        }

        public Criteria andFrostbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frostbalance not between", value1, value2, "frostbalance");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCreditsIsNull() {
            addCriterion("credits is null");
            return (Criteria) this;
        }

        public Criteria andCreditsIsNotNull() {
            addCriterion("credits is not null");
            return (Criteria) this;
        }

        public Criteria andCreditsEqualTo(Integer value) {
            addCriterion("credits =", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotEqualTo(Integer value) {
            addCriterion("credits <>", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThan(Integer value) {
            addCriterion("credits >", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThanOrEqualTo(Integer value) {
            addCriterion("credits >=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThan(Integer value) {
            addCriterion("credits <", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThanOrEqualTo(Integer value) {
            addCriterion("credits <=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsIn(List<Integer> values) {
            addCriterion("credits in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotIn(List<Integer> values) {
            addCriterion("credits not in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsBetween(Integer value1, Integer value2) {
            addCriterion("credits between", value1, value2, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotBetween(Integer value1, Integer value2) {
            addCriterion("credits not between", value1, value2, "credits");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
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