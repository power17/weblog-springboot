package com.power.weblog.admin.service;

import com.power.weblog.admin.model.VO.article.PublishArticleReqVO;
import com.power.weblog.common.utils.Response;

public interface AdminArticleService {
    /**
     * 发布文章
     * @param publishArticleReqVO
     * @return
     */
    Response publishArticle(PublishArticleReqVO publishArticleReqVO);
}
