package com.power.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.power.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}
