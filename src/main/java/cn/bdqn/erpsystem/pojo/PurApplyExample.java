package cn.bdqn.erpsystem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurApplyExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_Id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_Id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_Id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_Id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_Id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_Id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_Id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_Id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_Id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_Id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_Id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAOrderIsNull() {
            addCriterion("a_Order is null");
            return (Criteria) this;
        }

        public Criteria andAOrderIsNotNull() {
            addCriterion("a_Order is not null");
            return (Criteria) this;
        }

        public Criteria andAOrderEqualTo(String value) {
            addCriterion("a_Order =", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderNotEqualTo(String value) {
            addCriterion("a_Order <>", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderGreaterThan(String value) {
            addCriterion("a_Order >", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderGreaterThanOrEqualTo(String value) {
            addCriterion("a_Order >=", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderLessThan(String value) {
            addCriterion("a_Order <", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderLessThanOrEqualTo(String value) {
            addCriterion("a_Order <=", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderLike(String value) {
            addCriterion("a_Order like", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderNotLike(String value) {
            addCriterion("a_Order not like", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderIn(List<String> values) {
            addCriterion("a_Order in", values, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderNotIn(List<String> values) {
            addCriterion("a_Order not in", values, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderBetween(String value1, String value2) {
            addCriterion("a_Order between", value1, value2, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderNotBetween(String value1, String value2) {
            addCriterion("a_Order not between", value1, value2, "aOrder");
            return (Criteria) this;
        }

        public Criteria andASectionIsNull() {
            addCriterion("a_Section is null");
            return (Criteria) this;
        }

        public Criteria andASectionIsNotNull() {
            addCriterion("a_Section is not null");
            return (Criteria) this;
        }

        public Criteria andASectionEqualTo(Integer value) {
            addCriterion("a_Section =", value, "aSection");
            return (Criteria) this;
        }

        public Criteria andASectionNotEqualTo(Integer value) {
            addCriterion("a_Section <>", value, "aSection");
            return (Criteria) this;
        }

        public Criteria andASectionGreaterThan(Integer value) {
            addCriterion("a_Section >", value, "aSection");
            return (Criteria) this;
        }

        public Criteria andASectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_Section >=", value, "aSection");
            return (Criteria) this;
        }

        public Criteria andASectionLessThan(Integer value) {
            addCriterion("a_Section <", value, "aSection");
            return (Criteria) this;
        }

        public Criteria andASectionLessThanOrEqualTo(Integer value) {
            addCriterion("a_Section <=", value, "aSection");
            return (Criteria) this;
        }

        public Criteria andASectionIn(List<Integer> values) {
            addCriterion("a_Section in", values, "aSection");
            return (Criteria) this;
        }

        public Criteria andASectionNotIn(List<Integer> values) {
            addCriterion("a_Section not in", values, "aSection");
            return (Criteria) this;
        }

        public Criteria andASectionBetween(Integer value1, Integer value2) {
            addCriterion("a_Section between", value1, value2, "aSection");
            return (Criteria) this;
        }

        public Criteria andASectionNotBetween(Integer value1, Integer value2) {
            addCriterion("a_Section not between", value1, value2, "aSection");
            return (Criteria) this;
        }

        public Criteria andAPersonIsNull() {
            addCriterion("a_Person is null");
            return (Criteria) this;
        }

        public Criteria andAPersonIsNotNull() {
            addCriterion("a_Person is not null");
            return (Criteria) this;
        }

        public Criteria andAPersonEqualTo(Integer value) {
            addCriterion("a_Person =", value, "aPerson");
            return (Criteria) this;
        }

        public Criteria andAPersonNotEqualTo(Integer value) {
            addCriterion("a_Person <>", value, "aPerson");
            return (Criteria) this;
        }

        public Criteria andAPersonGreaterThan(Integer value) {
            addCriterion("a_Person >", value, "aPerson");
            return (Criteria) this;
        }

        public Criteria andAPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_Person >=", value, "aPerson");
            return (Criteria) this;
        }

        public Criteria andAPersonLessThan(Integer value) {
            addCriterion("a_Person <", value, "aPerson");
            return (Criteria) this;
        }

        public Criteria andAPersonLessThanOrEqualTo(Integer value) {
            addCriterion("a_Person <=", value, "aPerson");
            return (Criteria) this;
        }

        public Criteria andAPersonIn(List<Integer> values) {
            addCriterion("a_Person in", values, "aPerson");
            return (Criteria) this;
        }

        public Criteria andAPersonNotIn(List<Integer> values) {
            addCriterion("a_Person not in", values, "aPerson");
            return (Criteria) this;
        }

        public Criteria andAPersonBetween(Integer value1, Integer value2) {
            addCriterion("a_Person between", value1, value2, "aPerson");
            return (Criteria) this;
        }

        public Criteria andAPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("a_Person not between", value1, value2, "aPerson");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("a_Name is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("a_Name is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("a_Name =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("a_Name <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("a_Name >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("a_Name >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("a_Name <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("a_Name <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("a_Name like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("a_Name not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("a_Name in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("a_Name not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("a_Name between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("a_Name not between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andACountIsNull() {
            addCriterion("a_Count is null");
            return (Criteria) this;
        }

        public Criteria andACountIsNotNull() {
            addCriterion("a_Count is not null");
            return (Criteria) this;
        }

        public Criteria andACountEqualTo(Integer value) {
            addCriterion("a_Count =", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountNotEqualTo(Integer value) {
            addCriterion("a_Count <>", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountGreaterThan(Integer value) {
            addCriterion("a_Count >", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_Count >=", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountLessThan(Integer value) {
            addCriterion("a_Count <", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountLessThanOrEqualTo(Integer value) {
            addCriterion("a_Count <=", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountIn(List<Integer> values) {
            addCriterion("a_Count in", values, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountNotIn(List<Integer> values) {
            addCriterion("a_Count not in", values, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountBetween(Integer value1, Integer value2) {
            addCriterion("a_Count between", value1, value2, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountNotBetween(Integer value1, Integer value2) {
            addCriterion("a_Count not between", value1, value2, "aCount");
            return (Criteria) this;
        }

        public Criteria andAMoneyIsNull() {
            addCriterion("a_Money is null");
            return (Criteria) this;
        }

        public Criteria andAMoneyIsNotNull() {
            addCriterion("a_Money is not null");
            return (Criteria) this;
        }

        public Criteria andAMoneyEqualTo(Double value) {
            addCriterion("a_Money =", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotEqualTo(Double value) {
            addCriterion("a_Money <>", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyGreaterThan(Double value) {
            addCriterion("a_Money >", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("a_Money >=", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyLessThan(Double value) {
            addCriterion("a_Money <", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyLessThanOrEqualTo(Double value) {
            addCriterion("a_Money <=", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyIn(List<Double> values) {
            addCriterion("a_Money in", values, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotIn(List<Double> values) {
            addCriterion("a_Money not in", values, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyBetween(Double value1, Double value2) {
            addCriterion("a_Money between", value1, value2, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotBetween(Double value1, Double value2) {
            addCriterion("a_Money not between", value1, value2, "aMoney");
            return (Criteria) this;
        }

        public Criteria andADateIsNull() {
            addCriterion("a_Date is null");
            return (Criteria) this;
        }

        public Criteria andADateIsNotNull() {
            addCriterion("a_Date is not null");
            return (Criteria) this;
        }

        public Criteria andADateEqualTo(Date value) {
            addCriterion("a_Date =", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateNotEqualTo(Date value) {
            addCriterion("a_Date <>", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateGreaterThan(Date value) {
            addCriterion("a_Date >", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateGreaterThanOrEqualTo(Date value) {
            addCriterion("a_Date >=", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateLessThan(Date value) {
            addCriterion("a_Date <", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateLessThanOrEqualTo(Date value) {
            addCriterion("a_Date <=", value, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateIn(List<Date> values) {
            addCriterion("a_Date in", values, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateNotIn(List<Date> values) {
            addCriterion("a_Date not in", values, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateBetween(Date value1, Date value2) {
            addCriterion("a_Date between", value1, value2, "aDate");
            return (Criteria) this;
        }

        public Criteria andADateNotBetween(Date value1, Date value2) {
            addCriterion("a_Date not between", value1, value2, "aDate");
            return (Criteria) this;
        }

        public Criteria andARemarksIsNull() {
            addCriterion("a_Remarks is null");
            return (Criteria) this;
        }

        public Criteria andARemarksIsNotNull() {
            addCriterion("a_Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andARemarksEqualTo(String value) {
            addCriterion("a_Remarks =", value, "aRemarks");
            return (Criteria) this;
        }

        public Criteria andARemarksNotEqualTo(String value) {
            addCriterion("a_Remarks <>", value, "aRemarks");
            return (Criteria) this;
        }

        public Criteria andARemarksGreaterThan(String value) {
            addCriterion("a_Remarks >", value, "aRemarks");
            return (Criteria) this;
        }

        public Criteria andARemarksGreaterThanOrEqualTo(String value) {
            addCriterion("a_Remarks >=", value, "aRemarks");
            return (Criteria) this;
        }

        public Criteria andARemarksLessThan(String value) {
            addCriterion("a_Remarks <", value, "aRemarks");
            return (Criteria) this;
        }

        public Criteria andARemarksLessThanOrEqualTo(String value) {
            addCriterion("a_Remarks <=", value, "aRemarks");
            return (Criteria) this;
        }

        public Criteria andARemarksLike(String value) {
            addCriterion("a_Remarks like", value, "aRemarks");
            return (Criteria) this;
        }

        public Criteria andARemarksNotLike(String value) {
            addCriterion("a_Remarks not like", value, "aRemarks");
            return (Criteria) this;
        }

        public Criteria andARemarksIn(List<String> values) {
            addCriterion("a_Remarks in", values, "aRemarks");
            return (Criteria) this;
        }

        public Criteria andARemarksNotIn(List<String> values) {
            addCriterion("a_Remarks not in", values, "aRemarks");
            return (Criteria) this;
        }

        public Criteria andARemarksBetween(String value1, String value2) {
            addCriterion("a_Remarks between", value1, value2, "aRemarks");
            return (Criteria) this;
        }

        public Criteria andARemarksNotBetween(String value1, String value2) {
            addCriterion("a_Remarks not between", value1, value2, "aRemarks");
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