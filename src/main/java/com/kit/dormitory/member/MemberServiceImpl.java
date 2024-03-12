package com.kit.dormitory.member;

public class MemberServiceImpl implements MemberService{

    //private final MemberStorage memberStorage = new FileMemberStorage();
    private final MemberStorage memberStorage = new DbMemberStorage();
    @Override
    public void register(Member member) {
        memberStorage.store(member);
    }
    @Override
    public Member findMember(Member member) {
        return memberStorage.findById(member.getId());
    }
}
