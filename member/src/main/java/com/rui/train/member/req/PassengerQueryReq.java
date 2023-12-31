package com.rui.train.member.req;

import com.rui.train.common.req.PageReq;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/13 22:11
 * @Version 1.0
 */
public class PassengerQueryReq extends PageReq{

    private Long memberId;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PassengerQueryReq{");
        sb.append("memberId=").append(memberId);
        sb.append('}');
        return sb.toString();
    }
}
