package com.rui.train.business.mapper.cust;

import java.util.Date;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/22 1:07
 * @Version 1.0
 */
public interface SkTokenMapperCust {

    int decrease(Date date, String trainCode, int decreaseCount);
}

