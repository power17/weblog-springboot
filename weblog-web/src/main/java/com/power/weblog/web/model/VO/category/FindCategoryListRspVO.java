package com.power.weblog.web.model.VO.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FindCategoryListRspVO {
    private Long id;
    private String name;
}
