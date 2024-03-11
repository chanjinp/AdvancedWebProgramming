package com.kit.dormitory;

import com.kit.dormitory.member.Member;
import com.kit.dormitory.member.MemberServiceImpl;
import com.kit.dormitory.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L,"kim",1);
        memberService.register(member);
        Member findMember = memberService.findMember(member);
        System.out.println("findMember = " + findMember.getName());
        System.out.println("member = " + member.getName());
    }
}