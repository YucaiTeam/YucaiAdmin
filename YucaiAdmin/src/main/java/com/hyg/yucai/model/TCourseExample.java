package com.hyg.yucai.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCourseExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursesortIsNull() {
            addCriterion("courseSort is null");
            return (Criteria) this;
        }

        public Criteria andCoursesortIsNotNull() {
            addCriterion("courseSort is not null");
            return (Criteria) this;
        }

        public Criteria andCoursesortEqualTo(String value) {
            addCriterion("courseSort =", value, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursesortNotEqualTo(String value) {
            addCriterion("courseSort <>", value, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursesortGreaterThan(String value) {
            addCriterion("courseSort >", value, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursesortGreaterThanOrEqualTo(String value) {
            addCriterion("courseSort >=", value, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursesortLessThan(String value) {
            addCriterion("courseSort <", value, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursesortLessThanOrEqualTo(String value) {
            addCriterion("courseSort <=", value, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursesortLike(String value) {
            addCriterion("courseSort like", value, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursesortNotLike(String value) {
            addCriterion("courseSort not like", value, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursesortIn(List<String> values) {
            addCriterion("courseSort in", values, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursesortNotIn(List<String> values) {
            addCriterion("courseSort not in", values, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursesortBetween(String value1, String value2) {
            addCriterion("courseSort between", value1, value2, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursesortNotBetween(String value1, String value2) {
            addCriterion("courseSort not between", value1, value2, "coursesort");
            return (Criteria) this;
        }

        public Criteria andCoursedetailIsNull() {
            addCriterion("courseDetail is null");
            return (Criteria) this;
        }

        public Criteria andCoursedetailIsNotNull() {
            addCriterion("courseDetail is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedetailEqualTo(String value) {
            addCriterion("courseDetail =", value, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursedetailNotEqualTo(String value) {
            addCriterion("courseDetail <>", value, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursedetailGreaterThan(String value) {
            addCriterion("courseDetail >", value, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursedetailGreaterThanOrEqualTo(String value) {
            addCriterion("courseDetail >=", value, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursedetailLessThan(String value) {
            addCriterion("courseDetail <", value, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursedetailLessThanOrEqualTo(String value) {
            addCriterion("courseDetail <=", value, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursedetailLike(String value) {
            addCriterion("courseDetail like", value, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursedetailNotLike(String value) {
            addCriterion("courseDetail not like", value, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursedetailIn(List<String> values) {
            addCriterion("courseDetail in", values, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursedetailNotIn(List<String> values) {
            addCriterion("courseDetail not in", values, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursedetailBetween(String value1, String value2) {
            addCriterion("courseDetail between", value1, value2, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursedetailNotBetween(String value1, String value2) {
            addCriterion("courseDetail not between", value1, value2, "coursedetail");
            return (Criteria) this;
        }

        public Criteria andCoursehourIsNull() {
            addCriterion("courseHour is null");
            return (Criteria) this;
        }

        public Criteria andCoursehourIsNotNull() {
            addCriterion("courseHour is not null");
            return (Criteria) this;
        }

        public Criteria andCoursehourEqualTo(String value) {
            addCriterion("courseHour =", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotEqualTo(String value) {
            addCriterion("courseHour <>", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourGreaterThan(String value) {
            addCriterion("courseHour >", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourGreaterThanOrEqualTo(String value) {
            addCriterion("courseHour >=", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourLessThan(String value) {
            addCriterion("courseHour <", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourLessThanOrEqualTo(String value) {
            addCriterion("courseHour <=", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourLike(String value) {
            addCriterion("courseHour like", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotLike(String value) {
            addCriterion("courseHour not like", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourIn(List<String> values) {
            addCriterion("courseHour in", values, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotIn(List<String> values) {
            addCriterion("courseHour not in", values, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourBetween(String value1, String value2) {
            addCriterion("courseHour between", value1, value2, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotBetween(String value1, String value2) {
            addCriterion("courseHour not between", value1, value2, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursepriceIsNull() {
            addCriterion("coursePrice is null");
            return (Criteria) this;
        }

        public Criteria andCoursepriceIsNotNull() {
            addCriterion("coursePrice is not null");
            return (Criteria) this;
        }

        public Criteria andCoursepriceEqualTo(String value) {
            addCriterion("coursePrice =", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotEqualTo(String value) {
            addCriterion("coursePrice <>", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceGreaterThan(String value) {
            addCriterion("coursePrice >", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceGreaterThanOrEqualTo(String value) {
            addCriterion("coursePrice >=", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceLessThan(String value) {
            addCriterion("coursePrice <", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceLessThanOrEqualTo(String value) {
            addCriterion("coursePrice <=", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceLike(String value) {
            addCriterion("coursePrice like", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotLike(String value) {
            addCriterion("coursePrice not like", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceIn(List<String> values) {
            addCriterion("coursePrice in", values, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotIn(List<String> values) {
            addCriterion("coursePrice not in", values, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceBetween(String value1, String value2) {
            addCriterion("coursePrice between", value1, value2, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotBetween(String value1, String value2) {
            addCriterion("coursePrice not between", value1, value2, "courseprice");
            return (Criteria) this;
        }

        public Criteria andSeriesidIsNull() {
            addCriterion("seriesId is null");
            return (Criteria) this;
        }

        public Criteria andSeriesidIsNotNull() {
            addCriterion("seriesId is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesidEqualTo(Integer value) {
            addCriterion("seriesId =", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotEqualTo(Integer value) {
            addCriterion("seriesId <>", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidGreaterThan(Integer value) {
            addCriterion("seriesId >", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seriesId >=", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidLessThan(Integer value) {
            addCriterion("seriesId <", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidLessThanOrEqualTo(Integer value) {
            addCriterion("seriesId <=", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidIn(List<Integer> values) {
            addCriterion("seriesId in", values, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotIn(List<Integer> values) {
            addCriterion("seriesId not in", values, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidBetween(Integer value1, Integer value2) {
            addCriterion("seriesId between", value1, value2, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotBetween(Integer value1, Integer value2) {
            addCriterion("seriesId not between", value1, value2, "seriesid");
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
            addCriterionForJDBCDate("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate not between", value1, value2, "createdate");
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
            addCriterionForJDBCDate("editDate =", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("editDate <>", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateGreaterThan(Date value) {
            addCriterionForJDBCDate("editDate >", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("editDate >=", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateLessThan(Date value) {
            addCriterionForJDBCDate("editDate <", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("editDate <=", value, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateIn(List<Date> values) {
            addCriterionForJDBCDate("editDate in", values, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("editDate not in", values, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("editDate between", value1, value2, "editdate");
            return (Criteria) this;
        }

        public Criteria andEditdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("editDate not between", value1, value2, "editdate");
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