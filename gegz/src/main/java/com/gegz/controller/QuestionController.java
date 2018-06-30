package com.gegz.controller;

import com.gegz.base.BaseController;
import com.gegz.common.PageModel;
import com.gegz.dto.QuestionDto;
import com.gegz.dto.query.QuestionQueryDto;
import com.gegz.service.QuestionService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dell on 2018/6/12.
 */
@Controller
@RequestMapping("/question")
public class QuestionController extends BaseController{
    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/getQuestonsPageList",method = RequestMethod.GET)
    public ModelAndView attractionsList(PageModel pageModel, QuestionQueryDto questionQueryDto) {
        ModelAndView mav = getModelAndView();
        PageInfo<QuestionDto> pageInfo =  questionService.queryQuestionDtoListPage(pageModel,questionQueryDto);
        pageInfo.setPageNum(pageModel.getPage());
        mav.addObject("pageInfo",pageInfo);
        mav.addObject("questionQueryDto",questionQueryDto);
        mav.setViewName("question/questionList");
        return mav;
    }
}
