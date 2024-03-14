package com.kit.dormitory;

import com.kit.dormitory.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class TestExam {
    @Test
    public void hello() {
        //IoC 컨테이너의 싱글톤 지원
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberServicee1 = ac.getBean("memberService", MemberService.class);
        MemberService memberServicee2 = ac.getBean("memberService", MemberService.class);
        assertThat(memberServicee1).isSameAs(memberServicee2); //assert: 검증
    }
}
