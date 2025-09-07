package com.power.weblog.admin.service;

import com.power.weblog.admin.model.VO.article.DeleteArticleReqVO;
import com.power.weblog.admin.model.VO.article.FindArticleDetailReqVO;
import com.power.weblog.admin.model.VO.article.FindArticlePageListReqVO;
import com.power.weblog.admin.model.VO.article.PublishArticleReqVO;
import com.power.weblog.common.utils.Response;

public interface AdminArticleService {
    /**
     * 发布文章
     * @param publishArticleReqVO
     * @return
     */
    Response publishArticle(PublishArticleReqVO publishArticleReqVO);
    /**
     * 删除文章
     * @param deleteArticleReqVO
     * @return
     */
    Response deleteArticle(DeleteArticleReqVO deleteArticleReqVO);
    /**
     * 查询文章分页数据
     * @param findArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindArticlePageListReqVO findArticlePageListReqVO);
    /**
     * 查询文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);
}
