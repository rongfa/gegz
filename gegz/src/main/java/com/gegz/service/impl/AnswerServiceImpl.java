package com.gegz.service.impl;

import com.gegz.common.BeanUtilPlus;
import com.gegz.dao.AnswerDao;
import com.gegz.dto.AnswerDto;
import com.gegz.model.Answer;
import com.gegz.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/6/12.
 */
@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerDao answerDao;

    @Override
    public List<AnswerDto> getAnswerDtoListByQuestionId(Long questionId) {
        List<Answer> answers = answerDao.getAnswerListByQuestionId(questionId);
        List<AnswerDto> answerDtos = new ArrayList<>();
        for(Answer answer : answers){
            AnswerDto answerDto = new AnswerDto();
            BeanUtilPlus.copy(answer,answerDto);
            answerDtos.add(answerDto);
        }
        return answerDtos;
    }

    @Override
    public List<Long> getQuestionIdListByContent(String content) {
        return answerDao.getQuestionIdListByContent(content);
    }
}
