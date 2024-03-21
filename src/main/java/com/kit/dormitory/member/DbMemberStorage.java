package com.kit.dormitory.member;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
//@Qualifier("mainMemberStorage") //연관 관계를 설정할 때의 자격이 mainMemberStorage로 사용한다.
@Primary //우선 순위가 높게 설정
public class DbMemberStorage implements MemberStorage{
    private static Map<Long,Member> members = new HashMap<>();
    @Override
    public void store(Member member) {
        System.out.println("=============to db Storage==============");
        members.put(member.getId(), member);
    }
    @Override
    public Member findById(Long memberId) {
        System.out.println("=============from db Storage==============");
        return members.get(memberId);
    }
}
