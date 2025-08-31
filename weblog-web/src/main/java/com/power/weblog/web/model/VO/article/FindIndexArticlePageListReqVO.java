package com.power.weblog.web.model.VO.article;

import com.power.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@ApiModel(value = "首页查询文章分页 Vo")
public class FindIndexArticlePageListReqVO extends BasePageQuery {
}
