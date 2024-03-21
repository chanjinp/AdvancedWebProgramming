package com.kit.dormitory.member;

import com.kit.dormitory.annotation.ElapsedTimeLog;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
//@RequiredArgsConstructor //final field에 대한 Constructor을 만들어줌 -> 생성자가 1개 있다고 했을 때 Autowired로 생성자 생략보다는 바로 이렇게 선언
public class MemberServiceImpl implements MemberService {


    //private final MemberStorage memberStorage = new FileMemberStorage();
//    private final MemberStorage memberStorage = new DbMemberStorage();
    private final MemberStorage memberStorage;

//    @Autowired //생성자 주입 -> Bean을 사용할 때 의존성 주입
    public MemberServiceImpl(MemberStorage memberStorage) {
        this.memberStorage = memberStorage;
    }

    @ElapsedTimeLog
    @Override
    public void register(Member member) {
        memberStorage.store(member);
    }

    @ElapsedTimeLog
    @Override
    public Member findMember(Member member) {
        return memberStorage.findById(member.getId());
    }
}
