package com.rui.train.business.req;

import com.rui.train.common.req.PageReq;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/16 18:35
 * @Version 1.0
 */
public class TrainSeatQueryReq extends PageReq {

    private String trainCode;

    public String getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    @Override
    public String toString() {
        return "TrainSeatQueryReq{" +
                "trainCode='" + trainCode + '\'' +
                "} " + super.toString();
    }
}
