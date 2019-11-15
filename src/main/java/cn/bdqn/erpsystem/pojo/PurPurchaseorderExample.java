package cn.bdqn.erpsystem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurPurchaseorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurPurchaseorderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_Id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_Id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_Id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_Id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_Id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_Id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_Id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_Id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_Id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_Id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_Id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPOrderIsNull() {
            addCriterion("p_Order is null");
            return (Criteria) this;
        }

        public Criteria andPOrderIsNotNull() {
            addCriterion("p_Order is not null");
            return (Criteria) this;
        }

        public Criteria andPOrderEqualTo(String value) {
            addCriterion("p_Order =", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderNotEqualTo(String value) {
            addCriterion("p_Order <>", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderGreaterThan(String value) {
            addCriterion("p_Order >", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderGreaterThanOrEqualTo(String value) {
            addCriterion("p_Order >=", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderLessThan(String value) {
            addCriterion("p_Order <", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderLessThanOrEqualTo(String value) {
            addCriterion("p_Order <=", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderLike(String value) {
            addCriterion("p_Order like", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderNotLike(String value) {
            addCriterion("p_Order not like", value, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderIn(List<String> values) {
            addCriterion("p_Order in", values, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderNotIn(List<String> values) {
            addCriterion("p_Order not in", values, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderBetween(String value1, String value2) {
            addCriterion("p_Order between", value1, value2, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPOrderNotBetween(String value1, String value2) {
            addCriterion("p_Order not between", value1, value2, "pOrder");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_Name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_Name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_Name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_Name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_Name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_Name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_Name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_Name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_Name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_Name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_Name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_Name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_Name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNumberIsNull() {
            addCriterion("p_Number is null");
            return (Criteria) this;
        }

        public Criteria andPNumberIsNotNull() {
            addCriterion("p_Number is not null");
            return (Criteria) this;
        }

        public Criteria andPNumberEqualTo(Integer value) {
            addCriterion("p_Number =", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberNotEqualTo(Integer value) {
            addCriterion("p_Number <>", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberGreaterThan(Integer value) {
            addCriterion("p_Number >", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_Number >=", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberLessThan(Integer value) {
            addCriterion("p_Number <", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberLessThanOrEqualTo(Integer value) {
            addCriterion("p_Number <=", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberIn(List<Integer> values) {
            addCriterion("p_Number in", values, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberNotIn(List<Integer> values) {
            addCriterion("p_Number not in", values, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberBetween(Integer value1, Integer value2) {
            addCriterion("p_Number between", value1, value2, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("p_Number not between", value1, value2, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPMoneyIsNull() {
            addCriterion("p_Money is null");
            return (Criteria) this;
        }

        public Criteria andPMoneyIsNotNull() {
            addCriterion("p_Money is not null");
            return (Criteria) this;
        }

        public Criteria andPMoneyEqualTo(Double value) {
            addCriterion("p_Money =", value, "pMoney");
            return (Criteria) this;
        }

        public Criteria andPMoneyNotEqualTo(Double value) {
            addCriterion("p_Money <>", value, "pMoney");
            return (Criteria) this;
        }

        public Criteria andPMoneyGreaterThan(Double value) {
            addCriterion("p_Money >", value, "pMoney");
            return (Criteria) this;
        }

        public Criteria andPMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("p_Money >=", value, "pMoney");
            return (Criteria) this;
        }

        public Criteria andPMoneyLessThan(Double value) {
            addCriterion("p_Money <", value, "pMoney");
            return (Criteria) this;
        }

        public Criteria andPMoneyLessThanOrEqualTo(Double value) {
            addCriterion("p_Money <=", value, "pMoney");
            return (Criteria) this;
        }

        public Criteria andPMoneyIn(List<Double> values) {
            addCriterion("p_Money in", values, "pMoney");
            return (Criteria) this;
        }

        public Criteria andPMoneyNotIn(List<Double> values) {
            addCriterion("p_Money not in", values, "pMoney");
            return (Criteria) this;
        }

        public Criteria andPMoneyBetween(Double value1, Double value2) {
            addCriterion("p_Money between", value1, value2, "pMoney");
            return (Criteria) this;
        }

        public Criteria andPMoneyNotBetween(Double value1, Double value2) {
            addCriterion("p_Money not between", value1, value2, "pMoney");
            return (Criteria) this;
        }

        public Criteria andPDateIsNull() {
            addCriterion("p_Date is null");
            return (Criteria) this;
        }

        public Criteria andPDateIsNotNull() {
            addCriterion("p_Date is not null");
            return (Criteria) this;
        }

        public Criteria andPDateEqualTo(Date value) {
            addCriterionForJDBCDate("p_Date =", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("p_Date <>", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateGreaterThan(Date value) {
            addCriterionForJDBCDate("p_Date >", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_Date >=", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateLessThan(Date value) {
            addCriterionForJDBCDate("p_Date <", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_Date <=", value, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateIn(List<Date> values) {
            addCriterionForJDBCDate("p_Date in", values, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("p_Date not in", values, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_Date between", value1, value2, "pDate");
            return (Criteria) this;
        }

        public Criteria andPDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_Date not between", value1, value2, "pDate");
            return (Criteria) this;
        }

        public Criteria andPPersonIsNull() {
            addCriterion("p_Person is null");
            return (Criteria) this;
        }

        public Criteria andPPersonIsNotNull() {
            addCriterion("p_Person is not null");
            return (Criteria) this;
        }

        public Criteria andPPersonEqualTo(String value) {
            addCriterion("p_Person =", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonNotEqualTo(String value) {
            addCriterion("p_Person <>", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonGreaterThan(String value) {
            addCriterion("p_Person >", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonGreaterThanOrEqualTo(String value) {
            addCriterion("p_Person >=", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonLessThan(String value) {
            addCriterion("p_Person <", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonLessThanOrEqualTo(String value) {
            addCriterion("p_Person <=", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonLike(String value) {
            addCriterion("p_Person like", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonNotLike(String value) {
            addCriterion("p_Person not like", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonIn(List<String> values) {
            addCriterion("p_Person in", values, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonNotIn(List<String> values) {
            addCriterion("p_Person not in", values, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonBetween(String value1, String value2) {
            addCriterion("p_Person between", value1, value2, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonNotBetween(String value1, String value2) {
            addCriterion("p_Person not between", value1, value2, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPProvideridIsNull() {
            addCriterion("p_ProviderId is null");
            return (Criteria) this;
        }

        public Criteria andPProvideridIsNotNull() {
            addCriterion("p_ProviderId is not null");
            return (Criteria) this;
        }

        public Criteria andPProvideridEqualTo(String value) {
            addCriterion("p_ProviderId =", value, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProvideridNotEqualTo(String value) {
            addCriterion("p_ProviderId <>", value, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProvideridGreaterThan(String value) {
            addCriterion("p_ProviderId >", value, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProvideridGreaterThanOrEqualTo(String value) {
            addCriterion("p_ProviderId >=", value, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProvideridLessThan(String value) {
            addCriterion("p_ProviderId <", value, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProvideridLessThanOrEqualTo(String value) {
            addCriterion("p_ProviderId <=", value, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProvideridLike(String value) {
            addCriterion("p_ProviderId like", value, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProvideridNotLike(String value) {
            addCriterion("p_ProviderId not like", value, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProvideridIn(List<String> values) {
            addCriterion("p_ProviderId in", values, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProvideridNotIn(List<String> values) {
            addCriterion("p_ProviderId not in", values, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProvideridBetween(String value1, String value2) {
            addCriterion("p_ProviderId between", value1, value2, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProvideridNotBetween(String value1, String value2) {
            addCriterion("p_ProviderId not between", value1, value2, "pProviderid");
            return (Criteria) this;
        }

        public Criteria andPProductionidIsNull() {
            addCriterion("p_ProductionId is null");
            return (Criteria) this;
        }

        public Criteria andPProductionidIsNotNull() {
            addCriterion("p_ProductionId is not null");
            return (Criteria) this;
        }

        public Criteria andPProductionidEqualTo(Integer value) {
            addCriterion("p_ProductionId =", value, "pProductionid");
            return (Criteria) this;
        }

        public Criteria andPProductionidNotEqualTo(Integer value) {
            addCriterion("p_ProductionId <>", value, "pProductionid");
            return (Criteria) this;
        }

        public Criteria andPProductionidGreaterThan(Integer value) {
            addCriterion("p_ProductionId >", value, "pProductionid");
            return (Criteria) this;
        }

        public Criteria andPProductionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_ProductionId >=", value, "pProductionid");
            return (Criteria) this;
        }

        public Criteria andPProductionidLessThan(Integer value) {
            addCriterion("p_ProductionId <", value, "pProductionid");
            return (Criteria) this;
        }

        public Criteria andPProductionidLessThanOrEqualTo(Integer value) {
            addCriterion("p_ProductionId <=", value, "pProductionid");
            return (Criteria) this;
        }

        public Criteria andPProductionidIn(List<Integer> values) {
            addCriterion("p_ProductionId in", values, "pProductionid");
            return (Criteria) this;
        }

        public Criteria andPProductionidNotIn(List<Integer> values) {
            addCriterion("p_ProductionId not in", values, "pProductionid");
            return (Criteria) this;
        }

        public Criteria andPProductionidBetween(Integer value1, Integer value2) {
            addCriterion("p_ProductionId between", value1, value2, "pProductionid");
            return (Criteria) this;
        }

        public Criteria andPProductionidNotBetween(Integer value1, Integer value2) {
            addCriterion("p_ProductionId not between", value1, value2, "pProductionid");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidIsNull() {
            addCriterion("p_WarehouseId is null");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidIsNotNull() {
            addCriterion("p_WarehouseId is not null");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidEqualTo(Integer value) {
            addCriterion("p_WarehouseId =", value, "pWarehouseid");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidNotEqualTo(Integer value) {
            addCriterion("p_WarehouseId <>", value, "pWarehouseid");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidGreaterThan(Integer value) {
            addCriterion("p_WarehouseId >", value, "pWarehouseid");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_WarehouseId >=", value, "pWarehouseid");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidLessThan(Integer value) {
            addCriterion("p_WarehouseId <", value, "pWarehouseid");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidLessThanOrEqualTo(Integer value) {
            addCriterion("p_WarehouseId <=", value, "pWarehouseid");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidIn(List<Integer> values) {
            addCriterion("p_WarehouseId in", values, "pWarehouseid");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidNotIn(List<Integer> values) {
            addCriterion("p_WarehouseId not in", values, "pWarehouseid");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidBetween(Integer value1, Integer value2) {
            addCriterion("p_WarehouseId between", value1, value2, "pWarehouseid");
            return (Criteria) this;
        }

        public Criteria andPWarehouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("p_WarehouseId not between", value1, value2, "pWarehouseid");
            return (Criteria) this;
        }

        public Criteria andPRemarksIsNull() {
            addCriterion("p_Remarks is null");
            return (Criteria) this;
        }

        public Criteria andPRemarksIsNotNull() {
            addCriterion("p_Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPRemarksEqualTo(String value) {
            addCriterion("p_Remarks =", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksNotEqualTo(String value) {
            addCriterion("p_Remarks <>", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksGreaterThan(String value) {
            addCriterion("p_Remarks >", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("p_Remarks >=", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksLessThan(String value) {
            addCriterion("p_Remarks <", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksLessThanOrEqualTo(String value) {
            addCriterion("p_Remarks <=", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksLike(String value) {
            addCriterion("p_Remarks like", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksNotLike(String value) {
            addCriterion("p_Remarks not like", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksIn(List<String> values) {
            addCriterion("p_Remarks in", values, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksNotIn(List<String> values) {
            addCriterion("p_Remarks not in", values, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksBetween(String value1, String value2) {
            addCriterion("p_Remarks between", value1, value2, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksNotBetween(String value1, String value2) {
            addCriterion("p_Remarks not between", value1, value2, "pRemarks");
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