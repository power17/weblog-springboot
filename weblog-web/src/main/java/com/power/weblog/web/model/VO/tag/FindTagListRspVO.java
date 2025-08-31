package com.power.weblog.web.model.VO.tag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindTagListRspVO {
    private Long id;
    private String name;
}
