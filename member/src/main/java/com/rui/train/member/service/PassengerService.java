package com.rui.train.member.service;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.ObjectUtil;
import com.rui.train.common.util.SnowUtil;
import com.rui.train.member.domain.Passenger;
import com.rui.train.member.mapper.PassengerMapper;
import com.rui.train.member.req.PassengerSaveReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/12 16:47
 * @Version 1.0
 */
@Service
public class PassengerService {

    @Autowired
    private PassengerMapper passengerMapper;

    public void save(PassengerSaveReq req){
        DateTime now = DateTime.now();
        Passenger passenger = BeanUtil.copyProperties(req, Passenger.class);
        if (ObjectUtil.isNull(passenger.getId())) {
            passenger.setId(SnowUtil.getSnowflakeNextId());
            passenger.setCreateTime(now);
            passenger.setUpdateTime(now);
            passengerMapper.insert(passenger);
        } else {
            passenger.setUpdateTime(now);
            passengerMapper.updateByPrimaryKey(passenger);
        }
    }
}
