package com.rui.train.common.exception;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/10 21:52
 * @Version 1.0
 */
public enum BusinessExceptionEnum {

    MEMBER_MOBILE_EXIST("手机号已注册");

    private String desc;

    BusinessExceptionEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "BusinessExceptionEnum{" +
                "desc='" + desc + '\'' +
                "} " + super.toString();
    }
}

