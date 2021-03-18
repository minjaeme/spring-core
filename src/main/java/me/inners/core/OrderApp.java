package me.inners.core;

import me.inners.core.member.Grade;
import me.inners.core.member.Member;
import me.inners.core.member.MemberService;
import me.inners.core.order.Order;
import me.inners.core.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order=" + order);

    }
}
