package com.kit.dormitory.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //Method에 사용하기 떄문 -> register, find
@Retention(RetentionPolicy.RUNTIME) //생명 주기 설정
public @interface ElapsedTimeLog {
}
