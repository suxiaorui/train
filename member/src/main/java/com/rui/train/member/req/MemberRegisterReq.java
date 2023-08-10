package com.rui.train.member.req;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/10 21:33
 * @Version 1.0
 */
public class MemberRegisterReq {

//    @NotBlank(message = "【手机号】不能为空")
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "MemberRegisterReq{" +
                "mobile='" + mobile + '\'' +
                '}';
    }
}
