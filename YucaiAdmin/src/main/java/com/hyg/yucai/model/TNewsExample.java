package com.hyg.yucai.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TNewsExample() {
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

        public Criteria andNewsidIsNull() {
            addCriterion("newsId is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("newsId is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(Integer value) {
            addCriterion("newsId =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(Integer value) {
            addCriterion("newsId <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(Integer value) {
            addCriterion("newsId >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsId >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(Integer value) {
            addCriterion("newsId <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(Integer value) {
            addCriterion("newsId <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<Integer> values) {
            addCriterion("newsId in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<Integer> values) {
            addCriterion("newsId not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(Integer value1, Integer value2) {
            addCriterion("newsId between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(Integer value1, Integer value2) {
            addCriterion("newsId not between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNull() {
            addCriterion("newsTitle is null");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNotNull() {
            addCriterion("newsTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNewstitleEqualTo(String value) {
            addCriterion("newsTitle =", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotEqualTo(String value) {
            addCriterion("newsTitle <>", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThan(String value) {
            addCriterion("newsTitle >", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThanOrEqualTo(String value) {
            addCriterion("newsTitle >=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThan(String value) {
            addCriterion("newsTitle <", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThanOrEqualTo(String value) {
            addCriterion("newsTitle <=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLike(String value) {
            addCriterion("newsTitle like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotLike(String value) {
            addCriterion("newsTitle not like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleIn(List<String> values) {
            addCriterion("newsTitle in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotIn(List<String> values) {
            addCriterion("newsTitle not in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleBetween(String value1, String value2) {
            addCriterion("newsTitle between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotBetween(String value1, String value2) {
            addCriterion("newsTitle not between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewsguideIsNull() {
            addCriterion("newsGuide is null");
            return (Criteria) this;
        }

        public Criteria andNewsguideIsNotNull() {
            addCriterion("newsGuide is not null");
            return (Criteria) this;
        }

        public Criteria andNewsguideEqualTo(String value) {
            addCriterion("newsGuide =", value, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewsguideNotEqualTo(String value) {
            addCriterion("newsGuide <>", value, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewsguideGreaterThan(String value) {
            addCriterion("newsGuide >", value, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewsguideGreaterThanOrEqualTo(String value) {
            addCriterion("newsGuide >=", value, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewsguideLessThan(String value) {
            addCriterion("newsGuide <", value, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewsguideLessThanOrEqualTo(String value) {
            addCriterion("newsGuide <=", value, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewsguideLike(String value) {
            addCriterion("newsGuide like", value, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewsguideNotLike(String value) {
            addCriterion("newsGuide not like", value, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewsguideIn(List<String> values) {
            addCriterion("newsGuide in", values, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewsguideNotIn(List<String> values) {
            addCriterion("newsGuide not in", values, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewsguideBetween(String value1, String value2) {
            addCriterion("newsGuide between", value1, value2, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewsguideNotBetween(String value1, String value2) {
            addCriterion("newsGuide not between", value1, value2, "newsguide");
            return (Criteria) this;
        }

        public Criteria andNewssourceIsNull() {
            addCriterion("newsSource is null");
            return (Criteria) this;
        }

        public Criteria andNewssourceIsNotNull() {
            addCriterion("newsSource is not null");
            return (Criteria) this;
        }

        public Criteria andNewssourceEqualTo(String value) {
            addCriterion("newsSource =", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceNotEqualTo(String value) {
            addCriterion("newsSource <>", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceGreaterThan(String value) {
            addCriterion("newsSource >", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceGreaterThanOrEqualTo(String value) {
            addCriterion("newsSource >=", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceLessThan(String value) {
            addCriterion("newsSource <", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceLessThanOrEqualTo(String value) {
            addCriterion("newsSource <=", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceLike(String value) {
            addCriterion("newsSource like", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceNotLike(String value) {
            addCriterion("newsSource not like", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceIn(List<String> values) {
            addCriterion("newsSource in", values, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceNotIn(List<String> values) {
            addCriterion("newsSource not in", values, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceBetween(String value1, String value2) {
            addCriterion("newsSource between", value1, value2, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceNotBetween(String value1, String value2) {
            addCriterion("newsSource not between", value1, value2, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewsauthorIsNull() {
            addCriterion("newsAuthor is null");
            return (Criteria) this;
        }

        public Criteria andNewsauthorIsNotNull() {
            addCriterion("newsAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andNewsauthorEqualTo(String value) {
            addCriterion("newsAuthor =", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorNotEqualTo(String value) {
            addCriterion("newsAuthor <>", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorGreaterThan(String value) {
            addCriterion("newsAuthor >", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorGreaterThanOrEqualTo(String value) {
            addCriterion("newsAuthor >=", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorLessThan(String value) {
            addCriterion("newsAuthor <", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorLessThanOrEqualTo(String value) {
            addCriterion("newsAuthor <=", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorLike(String value) {
            addCriterion("newsAuthor like", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorNotLike(String value) {
            addCriterion("newsAuthor not like", value, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorIn(List<String> values) {
            addCriterion("newsAuthor in", values, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorNotIn(List<String> values) {
            addCriterion("newsAuthor not in", values, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorBetween(String value1, String value2) {
            addCriterion("newsAuthor between", value1, value2, "newsauthor");
            return (Criteria) this;
        }

        public Criteria andNewsauthorNotBetween(String value1, String value2) {
            addCriterion("newsAuthor not between", value1, value2, "newsauthor");
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

        public Criteria andBanknoIsNull() {
            addCriterion("bankno is null");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNotNull() {
            addCriterion("bankno is not null");
            return (Criteria) this;
        }

        public Criteria andBanknoEqualTo(String value) {
            addCriterion("bankno =", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotEqualTo(String value) {
            addCriterion("bankno <>", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThan(String value) {
            addCriterion("bankno >", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThanOrEqualTo(String value) {
            addCriterion("bankno >=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThan(String value) {
            addCriterion("bankno <", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThanOrEqualTo(String value) {
            addCriterion("bankno <=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLike(String value) {
            addCriterion("bankno like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotLike(String value) {
            addCriterion("bankno not like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoIn(List<String> values) {
            addCriterion("bankno in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotIn(List<String> values) {
            addCriterion("bankno not in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoBetween(String value1, String value2) {
            addCriterion("bankno between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotBetween(String value1, String value2) {
            addCriterion("bankno not between", value1, value2, "bankno");
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