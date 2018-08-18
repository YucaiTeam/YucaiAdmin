package com.hyg.yucai.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAreaExample() {
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

        public Criteria andAreaidIsNull() {
            addCriterion("areaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("areaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("areaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("areaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("areaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("areaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("areaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("areaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("areaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("areaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("areaId not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("areaName is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("areaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("areaName =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("areaName <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("areaName >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("areaName >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("areaName <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("areaName <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("areaName like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("areaName not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("areaName in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("areaName not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("areaName between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("areaName not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanoIsNull() {
            addCriterion("areano is null");
            return (Criteria) this;
        }

        public Criteria andAreanoIsNotNull() {
            addCriterion("areano is not null");
            return (Criteria) this;
        }

        public Criteria andAreanoEqualTo(String value) {
            addCriterion("areano =", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoNotEqualTo(String value) {
            addCriterion("areano <>", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoGreaterThan(String value) {
            addCriterion("areano >", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoGreaterThanOrEqualTo(String value) {
            addCriterion("areano >=", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoLessThan(String value) {
            addCriterion("areano <", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoLessThanOrEqualTo(String value) {
            addCriterion("areano <=", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoLike(String value) {
            addCriterion("areano like", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoNotLike(String value) {
            addCriterion("areano not like", value, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoIn(List<String> values) {
            addCriterion("areano in", values, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoNotIn(List<String> values) {
            addCriterion("areano not in", values, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoBetween(String value1, String value2) {
            addCriterion("areano between", value1, value2, "areano");
            return (Criteria) this;
        }

        public Criteria andAreanoNotBetween(String value1, String value2) {
            addCriterion("areano not between", value1, value2, "areano");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andEditdateIsNull() {
            addCriterion("editDate is null");
            return (Criteria) this;
        }

        public Criteria andEditdateIsNotNull() {
            addCriterion("editDate is not null");
            return (Criteria) this;
        }

        public Criteria andEditdateEqualTo(Date value) {
            addCriterion("editDate =", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateNotEqualTo(Date value) {
            addCriterion("editDate <>", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateGreaterThan(Date value) {
            addCriterion("editDate >", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateGreaterThanOrEqualTo(Date value) {
            addCriterion("editDate >=", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateLessThan(Date value) {
            addCriterion("editDate <", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateLessThanOrEqualTo(Date value) {
            addCriterion("editDate <=", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateIn(List<Date> values) {
            addCriterion("editDate in", values, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateNotIn(List<Date> values) {
            addCriterion("editDate not in", values, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateBetween(Date value1, Date value2) {
            addCriterion("editDate between", value1, value2, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateNotBetween(Date value1, Date value2) {
            addCriterion("editDate not between", value1, value2, "editdate");
            return (Criteria) this;
        }

        public Criteria andStandbyField01IsNull() {
            addCriterion("standby_field_01 is null");
            return (Criteria) this;
        }

        public Criteria andStandbyField01IsNotNull() {
            addCriterion("standby_field_01 is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyField01EqualTo(String value) {
            addCriterion("standby_field_01 =", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01NotEqualTo(String value) {
            addCriterion("standby_field_01 <>", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01GreaterThan(String value) {
            addCriterion("standby_field_01 >", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01GreaterThanOrEqualTo(String value) {
            addCriterion("standby_field_01 >=", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01LessThan(String value) {
            addCriterion("standby_field_01 <", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01LessThanOrEqualTo(String value) {
            addCriterion("standby_field_01 <=", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01Like(String value) {
            addCriterion("standby_field_01 like", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01NotLike(String value) {
            addCriterion("standby_field_01 not like", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01In(List<String> values) {
            addCriterion("standby_field_01 in", values, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01NotIn(List<String> values) {
            addCriterion("standby_field_01 not in", values, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01Between(String value1, String value2) {
            addCriterion("standby_field_01 between", value1, value2, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01NotBetween(String value1, String value2) {
            addCriterion("standby_field_01 not between", value1, value2, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField02IsNull() {
            addCriterion("standby_field_02 is null");
            return (Criteria) this;
        }

        public Criteria andStandbyField02IsNotNull() {
            addCriterion("standby_field_02 is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyField02EqualTo(String value) {
            addCriterion("standby_field_02 =", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02NotEqualTo(String value) {
            addCriterion("standby_field_02 <>", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02GreaterThan(String value) {
            addCriterion("standby_field_02 >", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02GreaterThanOrEqualTo(String value) {
            addCriterion("standby_field_02 >=", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02LessThan(String value) {
            addCriterion("standby_field_02 <", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02LessThanOrEqualTo(String value) {
            addCriterion("standby_field_02 <=", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02Like(String value) {
            addCriterion("standby_field_02 like", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02NotLike(String value) {
            addCriterion("standby_field_02 not like", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02In(List<String> values) {
            addCriterion("standby_field_02 in", values, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02NotIn(List<String> values) {
            addCriterion("standby_field_02 not in", values, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02Between(String value1, String value2) {
            addCriterion("standby_field_02 between", value1, value2, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02NotBetween(String value1, String value2) {
            addCriterion("standby_field_02 not between", value1, value2, "standbyField02");
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