package me.inners.core;

import me.inners.core.discount.DiscountPolicy;
import me.inners.core.discount.FixDiscountPolicy;
import me.inners.core.discount.RateDiscountPolicy;
import me.inners.core.member.MemberService;
import me.inners.core.member.MemberServiceImpl;
import me.inners.core.member.MemoryMemberRepository;
import me.inners.core.order.OrderService;
import me.inners.core.order.OrderServiceImpl;

public class AppConfig {

    // 역할과 구현이 한눈에 드러나
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
