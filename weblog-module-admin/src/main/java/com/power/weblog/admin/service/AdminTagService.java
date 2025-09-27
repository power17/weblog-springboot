package com.power.weblog.admin.service;

import com.power.weblog.admin.model.VO.tag.AddTagReqVO;
import com.power.weblog.admin.model.VO.tag.DeleteTagReqVO;
import com.power.weblog.admin.model.VO.tag.FindTagPageListReqVO;
import com.power.weblog.admin.model.VO.tag.SearchTagsReqVO;
import com.power.weblog.common.utils.Response;

public interface AdminTagService {
    /**
     * 添加标签集合
     * @param addTagReqVO
     * @return
     */
    Response addTags(AddTagReqVO addTagReqVO);
    Response findTagPageList(FindTagPageListReqVO findTagPageListReqVO);
    /**
     * 删除标签
     * @param deleteTagReqVO
     * @return
     */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    /**
     * 根据标签关键词模糊查询
     * @param searchTagsReqVO
     * @return
     */
    Response searchTags(SearchTagsReqVO searchTagsReqVO);

    /**
     * 查询标签 Select 列表数据
     * @return
     */
    Response findTagSelectList();


}
