package com.power.weblog.web.service;

import com.power.weblog.common.utils.Response;

public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList();
}
