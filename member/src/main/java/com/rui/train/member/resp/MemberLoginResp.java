package com.rui.train.member.resp;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/11 18:51
 * @Version 1.0
 */
public class MemberLoginResp {
    private Long id;

    private String mobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MemberLoginResp{");
        sb.append("id=").append(id);
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
