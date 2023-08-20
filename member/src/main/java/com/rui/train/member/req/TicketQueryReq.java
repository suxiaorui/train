package com.rui.train.member.req;

import com.rui.train.common.req.PageReq;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/20 17:08
 * @Version 1.0
 */
public class TicketQueryReq extends PageReq {

    private Long memberId;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "TicketQueryReq{" +
                "memberId=" + memberId +
                "} " + super.toString();
    }
}

