package com.gegz.service;

import com.gegz.dto.AnswerDto;

import java.util.List;

/**
 * Created by dell on 2018/6/12.
 */
public interface AnswerService {
    //根据问题Id获取答案
    List<AnswerDto> getAnswerDtoListByQuestionId(Long questionId);

    //根据答案内容获取问题列表
    List<Long> getQuestionIdListByContent(String content);
}
