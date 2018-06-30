package com.gegz.model;

import com.gegz.base.BaseDomain;

import javax.persistence.Table;

/**
 * Created by dell on 2018/6/12.
 */
@Table(name = "plat_answer")
public class Answer  extends BaseDomain<Long> {
    private static final long serialVersionUID = 605951941432048411L;

    private String content;

    private Boolean isRight;

    private Long questionId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getRight() {
        return isRight;
    }

    public void setRight(Boolean right) {
        isRight = right;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}
