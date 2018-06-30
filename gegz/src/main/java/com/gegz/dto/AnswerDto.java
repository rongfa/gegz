package com.gegz.dto;

import com.gegz.base.BaseDto;

/**
 * Created by dell on 2018/6/12.
 */
public class AnswerDto extends BaseDto<Long> {
    private static final long serialVersionUID = 605951941121043333L;

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
