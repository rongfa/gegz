package com.gegz.example;

import com.gegz.common.PageModel;
import com.gegz.common.utils.StringUtilPlus;
import com.gegz.dto.query.QuestionQueryDto;
import com.gegz.model.Question;
import com.github.pagehelper.PageHelper;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by dell on 2018/6/12.
 */
public class QuestionExample {
    public static Example getAttractionsExample(QuestionQueryDto questionQueryDto, PageModel pageModel) {
        PageHelper.startPage(pageModel.getPage(), pageModel.getPageSize());
        Example example = new Example(Question.class);
        Example.Criteria criteria = example.createCriteria();
        if(questionQueryDto.getStatus()!=null){
            criteria.andEqualTo("status",questionQueryDto.getStatus());
        }
        if(StringUtilPlus.isNotEmpty(questionQueryDto.getTitle())){
            criteria.andLike("title","%"+questionQueryDto.getTitle()+"%");
        }
        if(questionQueryDto.getQuestionIds()!=null && questionQueryDto.getQuestionIds().size()!=0){
            criteria.andIn("id",questionQueryDto.getQuestionIds());
        }
        return example;
    }
}
