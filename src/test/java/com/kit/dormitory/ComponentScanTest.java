package com.kit.dormitory;

import com.kit.dormitory.member.Member;
import com.kit.dormitory.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;

public class ComponentScanTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ComAppConfig.class);//ComAppConfig.class를 테스트
    @Test
    void comScanTest() {
        MemberService memberService = ac.getBean(MemberService.class);
        Member member = new Member(1L, "park", 4);
        memberService.register(member);

        Member member1 = memberService.findMember(member);
        assertThat(memberService).isInstanceOf(MemberService.class); //MemberService 타입인가 확인
    }
    @Test
    void AOP_Test() {
        MemberService memberService = ac.getBean(MemberService.class);
        System.out.println("memberService.getClass() = " + memberService.getClass());

        Class c = memberService.getClass(); //
        for (Method method : c.getDeclaredMethods() ) {
            System.out.println("method.getName() = " + method.getName());
        }
    }
}