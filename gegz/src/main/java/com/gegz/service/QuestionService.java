package com.gegz.service;

import com.gegz.common.PageModel;
import com.gegz.dto.QuestionDto;
import com.gegz.dto.query.QuestionQueryDto;
import com.github.pagehelper.PageInfo;

/**
 * Created by dell on 2018/6/12.
 */
public interface QuestionService {
    //获取分页
    PageInfo<QuestionDto> queryQuestionDtoListPage(PageModel pageModel, QuestionQueryDto questionQueryDto);
}
