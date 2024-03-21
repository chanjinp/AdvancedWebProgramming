package com.kit.dormitory;

import com.kit.dormitory.book.BookService;
import com.kit.dormitory.book.BookServiceImpl;
import com.kit.dormitory.book.DormName;
import com.kit.dormitory.fee.FeePolicy;
import com.kit.dormitory.fee.NewFeePolicy;
import com.kit.dormitory.fee.OldFeePolicy;
import com.kit.dormitory.member.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Configuration에도 Component 어노테이션이 존재 -> 스캔의 대상에 포함됨 -> Bean 중복되면 위험 = 에러
public class AppConfig {
    @Bean
    MemberService memberService() {
        return new MemberServiceImpl(memberStorage());
    }

    @Bean
    BookService bookService() {
        return new BookServiceImpl(feePolicy());
    }

    @Bean
    MemberStorage memberStorage() {
        return new DbMemberStorage();
    }

    @Bean
    FeePolicy feePolicy() {
        return new NewFeePolicy();
    }
}
