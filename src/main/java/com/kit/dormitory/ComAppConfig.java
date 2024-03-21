package com.kit.dormitory; //basePackage 설정

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
//중복 스캔되는 걸 없애주기 위해서 Filter를 사용해서 중복 예외처리 하는 방법
public class ComAppConfig {

}