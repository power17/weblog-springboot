package com.power.weblog.web.service;

import com.power.weblog.common.utils.Response;
import com.power.weblog.web.model.VO.tag.FindTagArticlePageListReqVO;

public interface TagService {
    /**
     * 获取标签列表
     *
     * @return
     */
    Response findTagList();


    /**
     * 获取标签下文章分页列表
     *
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);
}
