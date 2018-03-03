package com.qf.user.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUsersecurityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUsersecurityExample() {
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

        public Criteria andPayauthIsNull() {
            addCriterion("payauth is null");
            return (Criteria) this;
        }

        public Criteria andPayauthIsNotNull() {
            addCriterion("payauth is not null");
            return (Criteria) this;
        }

        public Criteria andPayauthEqualTo(Integer value) {
            addCriterion("payauth =", value, "payauth");
            return (Criteria) this;
        }

        public Criteria andPayauthNotEqualTo(Integer value) {
            addCriterion("payauth <>", value, "payauth");
            return (Criteria) this;
        }

        public Criteria andPayauthGreaterThan(Integer value) {
            addCriterion("payauth >", value, "payauth");
            return (Criteria) this;
        }

        public Criteria andPayauthGreaterThanOrEqualTo(Integer value) {
            addCriterion("payauth >=", value, "payauth");
            return (Criteria) this;
        }

        public Criteria andPayauthLessThan(Integer value) {
            addCriterion("payauth <", value, "payauth");
            return (Criteria) this;
        }

        public Criteria andPayauthLessThanOrEqualTo(Integer value) {
            addCriterion("payauth <=", value, "payauth");
            return (Criteria) this;
        }

        public Criteria andPayauthIn(List<Integer> values) {
            addCriterion("payauth in", values, "payauth");
            return (Criteria) this;
        }

        public Criteria andPayauthNotIn(List<Integer> values) {
            addCriterion("payauth not in", values, "payauth");
            return (Criteria) this;
        }

        public Criteria andPayauthBetween(Integer value1, Integer value2) {
            addCriterion("payauth between", value1, value2, "payauth");
            return (Criteria) this;
        }

        public Criteria andPayauthNotBetween(Integer value1, Integer value2) {
            addCriterion("payauth not between", value1, value2, "payauth");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("cardno is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("cardno is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("cardno =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("cardno <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("cardno >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("cardno >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("cardno <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("cardno <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("cardno like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("cardno not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("cardno in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("cardno not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("cardno between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("cardno not between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardauthIsNull() {
            addCriterion("cardauth is null");
            return (Criteria) this;
        }

        public Criteria andCardauthIsNotNull() {
            addCriterion("cardauth is not null");
            return (Criteria) this;
        }

        public Criteria andCardauthEqualTo(Integer value) {
            addCriterion("cardauth =", value, "cardauth");
            return (Criteria) this;
        }

        public Criteria andCardauthNotEqualTo(Integer value) {
            addCriterion("cardauth <>", value, "cardauth");
            return (Criteria) this;
        }

        public Criteria andCardauthGreaterThan(Integer value) {
            addCriterion("cardauth >", value, "cardauth");
            return (Criteria) this;
        }

        public Criteria andCardauthGreaterThanOrEqualTo(Integer value) {
            addCriterion("cardauth >=", value, "cardauth");
            return (Criteria) this;
        }

        public Criteria andCardauthLessThan(Integer value) {
            addCriterion("cardauth <", value, "cardauth");
            return (Criteria) this;
        }

        public Criteria andCardauthLessThanOrEqualTo(Integer value) {
            addCriterion("cardauth <=", value, "cardauth");
            return (Criteria) this;
        }

        public Criteria andCardauthIn(List<Integer> values) {
            addCriterion("cardauth in", values, "cardauth");
            return (Criteria) this;
        }

        public Criteria andCardauthNotIn(List<Integer> values) {
            addCriterion("cardauth not in", values, "cardauth");
            return (Criteria) this;
        }

        public Criteria andCardauthBetween(Integer value1, Integer value2) {
            addCriterion("cardauth between", value1, value2, "cardauth");
            return (Criteria) this;
        }

        public Criteria andCardauthNotBetween(Integer value1, Integer value2) {
            addCriterion("cardauth not between", value1, value2, "cardauth");
            return (Criteria) this;
        }

        public Criteria andSiteauthIsNull() {
            addCriterion("siteauth is null");
            return (Criteria) this;
        }

        public Criteria andSiteauthIsNotNull() {
            addCriterion("siteauth is not null");
            return (Criteria) this;
        }

        public Criteria andSiteauthEqualTo(Integer value) {
            addCriterion("siteauth =", value, "siteauth");
            return (Criteria) this;
        }

        public Criteria andSiteauthNotEqualTo(Integer value) {
            addCriterion("siteauth <>", value, "siteauth");
            return (Criteria) this;
        }

        public Criteria andSiteauthGreaterThan(Integer value) {
            addCriterion("siteauth >", value, "siteauth");
            return (Criteria) this;
        }

        public Criteria andSiteauthGreaterThanOrEqualTo(Integer value) {
            addCriterion("siteauth >=", value, "siteauth");
            return (Criteria) this;
        }

        public Criteria andSiteauthLessThan(Integer value) {
            addCriterion("siteauth <", value, "siteauth");
            return (Criteria) this;
        }

        public Criteria andSiteauthLessThanOrEqualTo(Integer value) {
            addCriterion("siteauth <=", value, "siteauth");
            return (Criteria) this;
        }

        public Criteria andSiteauthIn(List<Integer> values) {
            addCriterion("siteauth in", values, "siteauth");
            return (Criteria) this;
        }

        public Criteria andSiteauthNotIn(List<Integer> values) {
            addCriterion("siteauth not in", values, "siteauth");
            return (Criteria) this;
        }

        public Criteria andSiteauthBetween(Integer value1, Integer value2) {
            addCriterion("siteauth between", value1, value2, "siteauth");
            return (Criteria) this;
        }

        public Criteria andSiteauthNotBetween(Integer value1, Integer value2) {
            addCriterion("siteauth not between", value1, value2, "siteauth");
            return (Criteria) this;
        }

        public Criteria andPhoneauthIsNull() {
            addCriterion("phoneauth is null");
            return (Criteria) this;
        }

        public Criteria andPhoneauthIsNotNull() {
            addCriterion("phoneauth is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneauthEqualTo(Integer value) {
            addCriterion("phoneauth =", value, "phoneauth");
            return (Criteria) this;
        }

        public Criteria andPhoneauthNotEqualTo(Integer value) {
            addCriterion("phoneauth <>", value, "phoneauth");
            return (Criteria) this;
        }

        public Criteria andPhoneauthGreaterThan(Integer value) {
            addCriterion("phoneauth >", value, "phoneauth");
            return (Criteria) this;
        }

        public Criteria andPhoneauthGreaterThanOrEqualTo(Integer value) {
            addCriterion("phoneauth >=", value, "phoneauth");
            return (Criteria) this;
        }

        public Criteria andPhoneauthLessThan(Integer value) {
            addCriterion("phoneauth <", value, "phoneauth");
            return (Criteria) this;
        }

        public Criteria andPhoneauthLessThanOrEqualTo(Integer value) {
            addCriterion("phoneauth <=", value, "phoneauth");
            return (Criteria) this;
        }

        public Criteria andPhoneauthIn(List<Integer> values) {
            addCriterion("phoneauth in", values, "phoneauth");
            return (Criteria) this;
        }

        public Criteria andPhoneauthNotIn(List<Integer> values) {
            addCriterion("phoneauth not in", values, "phoneauth");
            return (Criteria) this;
        }

        public Criteria andPhoneauthBetween(Integer value1, Integer value2) {
            addCriterion("phoneauth between", value1, value2, "phoneauth");
            return (Criteria) this;
        }

        public Criteria andPhoneauthNotBetween(Integer value1, Integer value2) {
            addCriterion("phoneauth not between", value1, value2, "phoneauth");
            return (Criteria) this;
        }

        public Criteria andEmail1authIsNull() {
            addCriterion("email1auth is null");
            return (Criteria) this;
        }

        public Criteria andEmail1authIsNotNull() {
            addCriterion("email1auth is not null");
            return (Criteria) this;
        }

        public Criteria andEmail1authEqualTo(Integer value) {
            addCriterion("email1auth =", value, "email1auth");
            return (Criteria) this;
        }

        public Criteria andEmail1authNotEqualTo(Integer value) {
            addCriterion("email1auth <>", value, "email1auth");
            return (Criteria) this;
        }

        public Criteria andEmail1authGreaterThan(Integer value) {
            addCriterion("email1auth >", value, "email1auth");
            return (Criteria) this;
        }

        public Criteria andEmail1authGreaterThanOrEqualTo(Integer value) {
            addCriterion("email1auth >=", value, "email1auth");
            return (Criteria) this;
        }

        public Criteria andEmail1authLessThan(Integer value) {
            addCriterion("email1auth <", value, "email1auth");
            return (Criteria) this;
        }

        public Criteria andEmail1authLessThanOrEqualTo(Integer value) {
            addCriterion("email1auth <=", value, "email1auth");
            return (Criteria) this;
        }

        public Criteria andEmail1authIn(List<Integer> values) {
            addCriterion("email1auth in", values, "email1auth");
            return (Criteria) this;
        }

        public Criteria andEmail1authNotIn(List<Integer> values) {
            addCriterion("email1auth not in", values, "email1auth");
            return (Criteria) this;
        }

        public Criteria andEmail1authBetween(Integer value1, Integer value2) {
            addCriterion("email1auth between", value1, value2, "email1auth");
            return (Criteria) this;
        }

        public Criteria andEmail1authNotBetween(Integer value1, Integer value2) {
            addCriterion("email1auth not between", value1, value2, "email1auth");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNull() {
            addCriterion("verifier is null");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNotNull() {
            addCriterion("verifier is not null");
            return (Criteria) this;
        }

        public Criteria andVerifierEqualTo(String value) {
            addCriterion("verifier =", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotEqualTo(String value) {
            addCriterion("verifier <>", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThan(String value) {
            addCriterion("verifier >", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThanOrEqualTo(String value) {
            addCriterion("verifier >=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThan(String value) {
            addCriterion("verifier <", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThanOrEqualTo(String value) {
            addCriterion("verifier <=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLike(String value) {
            addCriterion("verifier like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotLike(String value) {
            addCriterion("verifier not like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierIn(List<String> values) {
            addCriterion("verifier in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotIn(List<String> values) {
            addCriterion("verifier not in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierBetween(String value1, String value2) {
            addCriterion("verifier between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotBetween(String value1, String value2) {
            addCriterion("verifier not between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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