package com.hyg.yucai.model;

public class TQuestionWithBLOBs extends TQuestion {
    private String questiontopic;

    private String questionanalysis;

    public String getQuestiontopic() {
        return questiontopic;
    }

    public void setQuestiontopic(String questiontopic) {
        this.questiontopic = questiontopic == null ? null : questiontopic.trim();
    }

    public String getQuestionanalysis() {
        return questionanalysis;
    }

    public void setQuestionanalysis(String questionanalysis) {
        this.questionanalysis = questionanalysis == null ? null : questionanalysis.trim();
    }
}