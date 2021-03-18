package me.inners.core.discount;

import me.inners.core.member.Grade;
import me.inners.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else  {
            return 0;
        }
    }
}
