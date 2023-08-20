package com.rui.train.business.mapper.cust;

import java.util.Date;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/20 16:51
 * @Version 1.0
 */
public interface DailyTrainTicketMapperCust {

    void updateCountBySell(Date date,
                           String trainCode,
                           String seatTypeCode,
                           Integer minStartIndex,
                           Integer maxStartIndex,
                           Integer minEndIndex,
                           Integer maxEndIndex);
}