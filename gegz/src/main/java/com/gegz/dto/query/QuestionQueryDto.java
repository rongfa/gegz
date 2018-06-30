package com.gegz.dto.query;

import com.gegz.dto.QuestionDto;

import java.util.List;

/**
 * Created by dell on 2018/6/12.
 */
public class QuestionQueryDto extends QuestionDto {
    private static final long serialVersionUID = -8968086084037499095L;

    private Integer searchTab;

    private String content;

    private String answerContent;

    private List<Long> questionIds;

    public Integer getSearchTab() {
        return searchTab;
    }

    public void setSearchTab(Integer searchTab) {
        this.searchTab = searchTab;
        if(searchTab!=null){
            if(searchTab==0){
                setTitle(getContent());
            }else if(searchTab==1){
                setAnswerContent(getContent());
            }
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public List<Long> getQuestionIds() {
        return questionIds;
    }

    public void setQuestionIds(List<Long> questionIds) {
        this.questionIds = questionIds;
    }
}
