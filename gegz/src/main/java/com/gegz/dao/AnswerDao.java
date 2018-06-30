package com.gegz.dao;

import com.gegz.base.BaseMapper;
import com.gegz.model.Answer;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AnswerDao extends BaseMapper<Answer> {
    @Select("select * from plat_answer where question_id = #{questionId}")
    List<Answer> getAnswerListByQuestionId(Long questionId);

    @Select("select question_id from plat_answer where content like CONCAT('%',#{content},'%')")
    List<Long> getQuestionIdListByContent(String content);
}