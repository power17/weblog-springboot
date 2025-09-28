package com.power.weblog.web.service;

import com.power.weblog.common.utils.Response;
import com.power.weblog.web.model.VO.article.FindIndexArticlePageListReqVO;

public interface ArticleService {
    /**
     * 获取首页文章分页数据
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);
}
