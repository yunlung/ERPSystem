package cn.bdqn.erpsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class PurPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurPersonExample() {
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

        public Criteria andPersonidIsNull() {
            addCriterion("personId is null");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNotNull() {
            addCriterion("personId is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidEqualTo(Integer value) {
            addCriterion("personId =", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotEqualTo(Integer value) {
            addCriterion("personId <>", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThan(Integer value) {
            addCriterion("personId >", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("personId >=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThan(Integer value) {
            addCriterion("personId <", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThanOrEqualTo(Integer value) {
            addCriterion("personId <=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidIn(List<Integer> values) {
            addCriterion("personId in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotIn(List<Integer> values) {
            addCriterion("personId not in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidBetween(Integer value1, Integer value2) {
            addCriterion("personId between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotBetween(Integer value1, Integer value2) {
            addCriterion("personId not between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonnameIsNull() {
            addCriterion("personName is null");
            return (Criteria) this;
        }

        public Criteria andPersonnameIsNotNull() {
            addCriterion("personName is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnameEqualTo(String value) {
            addCriterion("personName =", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotEqualTo(String value) {
            addCriterion("personName <>", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameGreaterThan(String value) {
            addCriterion("personName >", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("personName >=", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLessThan(String value) {
            addCriterion("personName <", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLessThanOrEqualTo(String value) {
            addCriterion("personName <=", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLike(String value) {
            addCriterion("personName like", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotLike(String value) {
            addCriterion("personName not like", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameIn(List<String> values) {
            addCriterion("personName in", values, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotIn(List<String> values) {
            addCriterion("personName not in", values, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameBetween(String value1, String value2) {
            addCriterion("personName between", value1, value2, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotBetween(String value1, String value2) {
            addCriterion("personName not between", value1, value2, "personname");
            return (Criteria) this;
        }

        public Criteria andPersontelIsNull() {
            addCriterion("personTel is null");
            return (Criteria) this;
        }

        public Criteria andPersontelIsNotNull() {
            addCriterion("personTel is not null");
            return (Criteria) this;
        }

        public Criteria andPersontelEqualTo(String value) {
            addCriterion("personTel =", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelNotEqualTo(String value) {
            addCriterion("personTel <>", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelGreaterThan(String value) {
            addCriterion("personTel >", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelGreaterThanOrEqualTo(String value) {
            addCriterion("personTel >=", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelLessThan(String value) {
            addCriterion("personTel <", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelLessThanOrEqualTo(String value) {
            addCriterion("personTel <=", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelLike(String value) {
            addCriterion("personTel like", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelNotLike(String value) {
            addCriterion("personTel not like", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelIn(List<String> values) {
            addCriterion("personTel in", values, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelNotIn(List<String> values) {
            addCriterion("personTel not in", values, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelBetween(String value1, String value2) {
            addCriterion("personTel between", value1, value2, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelNotBetween(String value1, String value2) {
            addCriterion("personTel not between", value1, value2, "persontel");
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