package com.gegz.dto;

import com.gegz.base.BaseDto;

import java.util.Date;
import java.util.List;

/**
 * Created by dell on 2018/6/12.
 */
public class QuestionDto extends BaseDto<Long> {
    private static final long serialVersionUID = 605951294112101931L;

    private String title;

    private Boolean status;

    private Date createTime;

    private Date updateTime;

    private List<AnswerDto> answerDtos;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<AnswerDto> getAnswerDtos() {
        return answerDtos;
    }

    public void setAnswerDtos(List<AnswerDto> answerDtos) {
        this.answerDtos = answerDtos;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
