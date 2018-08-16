package com.hyg.yucai.model;

import java.util.Date;

public class TCourse {
    private Integer courseid;

    private String coursesort;

    private String coursedetail;

    private String coursehour;

    private String courseprice;

    private Integer seriesid;

    private Date createdate;

    private Date editdate;

    private String standbyField01;

    private String standbyField02;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursesort() {
        return coursesort;
    }

    public void setCoursesort(String coursesort) {
        this.coursesort = coursesort == null ? null : coursesort.trim();
    }

    public String getCoursedetail() {
        return coursedetail;
    }

    public void setCoursedetail(String coursedetail) {
        this.coursedetail = coursedetail == null ? null : coursedetail.trim();
    }

    public String getCoursehour() {
        return coursehour;
    }

    public void setCoursehour(String coursehour) {
        this.coursehour = coursehour == null ? null : coursehour.trim();
    }

    public String getCourseprice() {
        return courseprice;
    }

    public void setCourseprice(String courseprice) {
        this.courseprice = courseprice == null ? null : courseprice.trim();
    }

    public Integer getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(Integer seriesid) {
        this.seriesid = seriesid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getEditdate() {
        return editdate;
    }

    public void setEditdate(Date editdate) {
        this.editdate = editdate;
    }

    public String getStandbyField01() {
        return standbyField01;
    }

    public void setStandbyField01(String standbyField01) {
        this.standbyField01 = standbyField01 == null ? null : standbyField01.trim();
    }

    public String getStandbyField02() {
        return standbyField02;
    }

    public void setStandbyField02(String standbyField02) {
        this.standbyField02 = standbyField02 == null ? null : standbyField02.trim();
    }
}