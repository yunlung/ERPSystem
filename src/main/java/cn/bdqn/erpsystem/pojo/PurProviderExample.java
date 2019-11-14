package cn.bdqn.erpsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class PurProviderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurProviderExample() {
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

        public Criteria andProIdIsNull() {
            addCriterion("pro_Id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_Id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("pro_Id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("pro_Id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("pro_Id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_Id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("pro_Id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_Id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("pro_Id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("pro_Id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_Id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_Id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProCodeIsNull() {
            addCriterion("pro_Code is null");
            return (Criteria) this;
        }

        public Criteria andProCodeIsNotNull() {
            addCriterion("pro_Code is not null");
            return (Criteria) this;
        }

        public Criteria andProCodeEqualTo(String value) {
            addCriterion("pro_Code =", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotEqualTo(String value) {
            addCriterion("pro_Code <>", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThan(String value) {
            addCriterion("pro_Code >", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_Code >=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThan(String value) {
            addCriterion("pro_Code <", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThanOrEqualTo(String value) {
            addCriterion("pro_Code <=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLike(String value) {
            addCriterion("pro_Code like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotLike(String value) {
            addCriterion("pro_Code not like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeIn(List<String> values) {
            addCriterion("pro_Code in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotIn(List<String> values) {
            addCriterion("pro_Code not in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeBetween(String value1, String value2) {
            addCriterion("pro_Code between", value1, value2, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotBetween(String value1, String value2) {
            addCriterion("pro_Code not between", value1, value2, "proCode");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_Name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_Name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_Name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_Name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_Name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_Name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_Name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_Name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_Name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_Name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_Name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_Name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_Name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_Name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProAddressIsNull() {
            addCriterion("pro_Address is null");
            return (Criteria) this;
        }

        public Criteria andProAddressIsNotNull() {
            addCriterion("pro_Address is not null");
            return (Criteria) this;
        }

        public Criteria andProAddressEqualTo(String value) {
            addCriterion("pro_Address =", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotEqualTo(String value) {
            addCriterion("pro_Address <>", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressGreaterThan(String value) {
            addCriterion("pro_Address >", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pro_Address >=", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLessThan(String value) {
            addCriterion("pro_Address <", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLessThanOrEqualTo(String value) {
            addCriterion("pro_Address <=", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLike(String value) {
            addCriterion("pro_Address like", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotLike(String value) {
            addCriterion("pro_Address not like", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressIn(List<String> values) {
            addCriterion("pro_Address in", values, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotIn(List<String> values) {
            addCriterion("pro_Address not in", values, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressBetween(String value1, String value2) {
            addCriterion("pro_Address between", value1, value2, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotBetween(String value1, String value2) {
            addCriterion("pro_Address not between", value1, value2, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProPersonIsNull() {
            addCriterion("pro_Person is null");
            return (Criteria) this;
        }

        public Criteria andProPersonIsNotNull() {
            addCriterion("pro_Person is not null");
            return (Criteria) this;
        }

        public Criteria andProPersonEqualTo(String value) {
            addCriterion("pro_Person =", value, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProPersonNotEqualTo(String value) {
            addCriterion("pro_Person <>", value, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProPersonGreaterThan(String value) {
            addCriterion("pro_Person >", value, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProPersonGreaterThanOrEqualTo(String value) {
            addCriterion("pro_Person >=", value, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProPersonLessThan(String value) {
            addCriterion("pro_Person <", value, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProPersonLessThanOrEqualTo(String value) {
            addCriterion("pro_Person <=", value, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProPersonLike(String value) {
            addCriterion("pro_Person like", value, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProPersonNotLike(String value) {
            addCriterion("pro_Person not like", value, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProPersonIn(List<String> values) {
            addCriterion("pro_Person in", values, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProPersonNotIn(List<String> values) {
            addCriterion("pro_Person not in", values, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProPersonBetween(String value1, String value2) {
            addCriterion("pro_Person between", value1, value2, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProPersonNotBetween(String value1, String value2) {
            addCriterion("pro_Person not between", value1, value2, "proPerson");
            return (Criteria) this;
        }

        public Criteria andProTelIsNull() {
            addCriterion("pro_Tel is null");
            return (Criteria) this;
        }

        public Criteria andProTelIsNotNull() {
            addCriterion("pro_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andProTelEqualTo(String value) {
            addCriterion("pro_Tel =", value, "proTel");
            return (Criteria) this;
        }

        public Criteria andProTelNotEqualTo(String value) {
            addCriterion("pro_Tel <>", value, "proTel");
            return (Criteria) this;
        }

        public Criteria andProTelGreaterThan(String value) {
            addCriterion("pro_Tel >", value, "proTel");
            return (Criteria) this;
        }

        public Criteria andProTelGreaterThanOrEqualTo(String value) {
            addCriterion("pro_Tel >=", value, "proTel");
            return (Criteria) this;
        }

        public Criteria andProTelLessThan(String value) {
            addCriterion("pro_Tel <", value, "proTel");
            return (Criteria) this;
        }

        public Criteria andProTelLessThanOrEqualTo(String value) {
            addCriterion("pro_Tel <=", value, "proTel");
            return (Criteria) this;
        }

        public Criteria andProTelLike(String value) {
            addCriterion("pro_Tel like", value, "proTel");
            return (Criteria) this;
        }

        public Criteria andProTelNotLike(String value) {
            addCriterion("pro_Tel not like", value, "proTel");
            return (Criteria) this;
        }

        public Criteria andProTelIn(List<String> values) {
            addCriterion("pro_Tel in", values, "proTel");
            return (Criteria) this;
        }

        public Criteria andProTelNotIn(List<String> values) {
            addCriterion("pro_Tel not in", values, "proTel");
            return (Criteria) this;
        }

        public Criteria andProTelBetween(String value1, String value2) {
            addCriterion("pro_Tel between", value1, value2, "proTel");
            return (Criteria) this;
        }

        public Criteria andProTelNotBetween(String value1, String value2) {
            addCriterion("pro_Tel not between", value1, value2, "proTel");
            return (Criteria) this;
        }

        public Criteria andProRemarksIsNull() {
            addCriterion("pro_Remarks is null");
            return (Criteria) this;
        }

        public Criteria andProRemarksIsNotNull() {
            addCriterion("pro_Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andProRemarksEqualTo(String value) {
            addCriterion("pro_Remarks =", value, "proRemarks");
            return (Criteria) this;
        }

        public Criteria andProRemarksNotEqualTo(String value) {
            addCriterion("pro_Remarks <>", value, "proRemarks");
            return (Criteria) this;
        }

        public Criteria andProRemarksGreaterThan(String value) {
            addCriterion("pro_Remarks >", value, "proRemarks");
            return (Criteria) this;
        }

        public Criteria andProRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("pro_Remarks >=", value, "proRemarks");
            return (Criteria) this;
        }

        public Criteria andProRemarksLessThan(String value) {
            addCriterion("pro_Remarks <", value, "proRemarks");
            return (Criteria) this;
        }

        public Criteria andProRemarksLessThanOrEqualTo(String value) {
            addCriterion("pro_Remarks <=", value, "proRemarks");
            return (Criteria) this;
        }

        public Criteria andProRemarksLike(String value) {
            addCriterion("pro_Remarks like", value, "proRemarks");
            return (Criteria) this;
        }

        public Criteria andProRemarksNotLike(String value) {
            addCriterion("pro_Remarks not like", value, "proRemarks");
            return (Criteria) this;
        }

        public Criteria andProRemarksIn(List<String> values) {
            addCriterion("pro_Remarks in", values, "proRemarks");
            return (Criteria) this;
        }

        public Criteria andProRemarksNotIn(List<String> values) {
            addCriterion("pro_Remarks not in", values, "proRemarks");
            return (Criteria) this;
        }

        public Criteria andProRemarksBetween(String value1, String value2) {
            addCriterion("pro_Remarks between", value1, value2, "proRemarks");
            return (Criteria) this;
        }

        public Criteria andProRemarksNotBetween(String value1, String value2) {
            addCriterion("pro_Remarks not between", value1, value2, "proRemarks");
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