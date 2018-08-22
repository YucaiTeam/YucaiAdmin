package com.hyg.yucai.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TQuestionExample() {
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

        public Criteria andQuestionidIsNull() {
            addCriterion("questionId is null");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNotNull() {
            addCriterion("questionId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionidEqualTo(Integer value) {
            addCriterion("questionId =", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotEqualTo(Integer value) {
            addCriterion("questionId <>", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThan(Integer value) {
            addCriterion("questionId >", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionId >=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThan(Integer value) {
            addCriterion("questionId <", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThanOrEqualTo(Integer value) {
            addCriterion("questionId <=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIn(List<Integer> values) {
            addCriterion("questionId in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotIn(List<Integer> values) {
            addCriterion("questionId not in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidBetween(Integer value1, Integer value2) {
            addCriterion("questionId between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotBetween(Integer value1, Integer value2) {
            addCriterion("questionId not between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1IsNull() {
            addCriterion("questionOption1 is null");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1IsNotNull() {
            addCriterion("questionOption1 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1EqualTo(String value) {
            addCriterion("questionOption1 =", value, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1NotEqualTo(String value) {
            addCriterion("questionOption1 <>", value, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1GreaterThan(String value) {
            addCriterion("questionOption1 >", value, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1GreaterThanOrEqualTo(String value) {
            addCriterion("questionOption1 >=", value, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1LessThan(String value) {
            addCriterion("questionOption1 <", value, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1LessThanOrEqualTo(String value) {
            addCriterion("questionOption1 <=", value, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1Like(String value) {
            addCriterion("questionOption1 like", value, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1NotLike(String value) {
            addCriterion("questionOption1 not like", value, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1In(List<String> values) {
            addCriterion("questionOption1 in", values, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1NotIn(List<String> values) {
            addCriterion("questionOption1 not in", values, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1Between(String value1, String value2) {
            addCriterion("questionOption1 between", value1, value2, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption1NotBetween(String value1, String value2) {
            addCriterion("questionOption1 not between", value1, value2, "questionoption1");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2IsNull() {
            addCriterion("questionOption2 is null");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2IsNotNull() {
            addCriterion("questionOption2 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2EqualTo(String value) {
            addCriterion("questionOption2 =", value, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2NotEqualTo(String value) {
            addCriterion("questionOption2 <>", value, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2GreaterThan(String value) {
            addCriterion("questionOption2 >", value, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2GreaterThanOrEqualTo(String value) {
            addCriterion("questionOption2 >=", value, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2LessThan(String value) {
            addCriterion("questionOption2 <", value, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2LessThanOrEqualTo(String value) {
            addCriterion("questionOption2 <=", value, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2Like(String value) {
            addCriterion("questionOption2 like", value, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2NotLike(String value) {
            addCriterion("questionOption2 not like", value, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2In(List<String> values) {
            addCriterion("questionOption2 in", values, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2NotIn(List<String> values) {
            addCriterion("questionOption2 not in", values, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2Between(String value1, String value2) {
            addCriterion("questionOption2 between", value1, value2, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption2NotBetween(String value1, String value2) {
            addCriterion("questionOption2 not between", value1, value2, "questionoption2");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3IsNull() {
            addCriterion("questionOption3 is null");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3IsNotNull() {
            addCriterion("questionOption3 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3EqualTo(String value) {
            addCriterion("questionOption3 =", value, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3NotEqualTo(String value) {
            addCriterion("questionOption3 <>", value, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3GreaterThan(String value) {
            addCriterion("questionOption3 >", value, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3GreaterThanOrEqualTo(String value) {
            addCriterion("questionOption3 >=", value, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3LessThan(String value) {
            addCriterion("questionOption3 <", value, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3LessThanOrEqualTo(String value) {
            addCriterion("questionOption3 <=", value, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3Like(String value) {
            addCriterion("questionOption3 like", value, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3NotLike(String value) {
            addCriterion("questionOption3 not like", value, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3In(List<String> values) {
            addCriterion("questionOption3 in", values, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3NotIn(List<String> values) {
            addCriterion("questionOption3 not in", values, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3Between(String value1, String value2) {
            addCriterion("questionOption3 between", value1, value2, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption3NotBetween(String value1, String value2) {
            addCriterion("questionOption3 not between", value1, value2, "questionoption3");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4IsNull() {
            addCriterion("questionOption4 is null");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4IsNotNull() {
            addCriterion("questionOption4 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4EqualTo(String value) {
            addCriterion("questionOption4 =", value, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4NotEqualTo(String value) {
            addCriterion("questionOption4 <>", value, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4GreaterThan(String value) {
            addCriterion("questionOption4 >", value, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4GreaterThanOrEqualTo(String value) {
            addCriterion("questionOption4 >=", value, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4LessThan(String value) {
            addCriterion("questionOption4 <", value, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4LessThanOrEqualTo(String value) {
            addCriterion("questionOption4 <=", value, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4Like(String value) {
            addCriterion("questionOption4 like", value, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4NotLike(String value) {
            addCriterion("questionOption4 not like", value, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4In(List<String> values) {
            addCriterion("questionOption4 in", values, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4NotIn(List<String> values) {
            addCriterion("questionOption4 not in", values, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4Between(String value1, String value2) {
            addCriterion("questionOption4 between", value1, value2, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionoption4NotBetween(String value1, String value2) {
            addCriterion("questionOption4 not between", value1, value2, "questionoption4");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerIsNull() {
            addCriterion("questionAnswer is null");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerIsNotNull() {
            addCriterion("questionAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerEqualTo(String value) {
            addCriterion("questionAnswer =", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotEqualTo(String value) {
            addCriterion("questionAnswer <>", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerGreaterThan(String value) {
            addCriterion("questionAnswer >", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerGreaterThanOrEqualTo(String value) {
            addCriterion("questionAnswer >=", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerLessThan(String value) {
            addCriterion("questionAnswer <", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerLessThanOrEqualTo(String value) {
            addCriterion("questionAnswer <=", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerLike(String value) {
            addCriterion("questionAnswer like", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotLike(String value) {
            addCriterion("questionAnswer not like", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerIn(List<String> values) {
            addCriterion("questionAnswer in", values, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotIn(List<String> values) {
            addCriterion("questionAnswer not in", values, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerBetween(String value1, String value2) {
            addCriterion("questionAnswer between", value1, value2, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotBetween(String value1, String value2) {
            addCriterion("questionAnswer not between", value1, value2, "questionanswer");
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