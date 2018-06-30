package com.gegz.service.impl;

import com.gegz.common.BeanUtilPlus;
import com.gegz.common.PageModel;
import com.gegz.common.utils.StringUtilPlus;
import com.gegz.dao.QuestionDao;
import com.gegz.dto.QuestionDto;
import com.gegz.dto.query.QuestionQueryDto;
import com.gegz.example.QuestionExample;
import com.gegz.model.Question;
import com.gegz.service.AnswerService;
import com.gegz.service.QuestionService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/6/12.
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDao;

    @Autowired
    private AnswerService answerService;

    @Override
    public PageInfo<QuestionDto> queryQuestionDtoListPage(PageModel pageModel, QuestionQueryDto questionQueryDto) {
        List<QuestionDto> questionDtos = new ArrayList<>();
        if(StringUtilPlus.isNotEmpty(questionQueryDto.getAnswerContent())){
            List<Long> questionIds = answerService.getQuestionIdListByContent(questionQueryDto.getAnswerContent());
            if(questionIds==null || questionIds.size()==0){
                return new PageInfo<>(questionDtos, 0);
            }else{
                questionQueryDto.setQuestionIds(questionIds);
            }
        }
        Example example = QuestionExample.getAttractionsExample(questionQueryDto, pageModel);
        Page<Question> questions = (Page<Question>)questionDao.selectByExample(example);
        for(Question question : questions){
            QuestionDto questionDto = new QuestionDto();
            BeanUtilPlus.copy(question,questionDto);
            questionDto.setAnswerDtos(answerService.getAnswerDtoListByQuestionId(question.getId()));
            questionDtos.add(questionDto);
        }
        return new PageInfo<>(questionDtos, questions.getPages());
    }
}
