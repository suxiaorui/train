package com.rui.train.common.util;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/10 22:19
 * @Version 1.0
 */

import cn.hutool.core.util.IdUtil;

/**
 * 封装hutool雪花算法
 */
public class SnowUtil {

    private static long dataCenterId = 1;  //数据中心
    private static long workerId = 1;     //机器标识

    public static long getSnowflakeNextId() {
        return IdUtil.getSnowflake(workerId, dataCenterId).nextId();
    }

    public static String getSnowflakeNextIdStr() {
        return IdUtil.getSnowflake(workerId, dataCenterId).nextIdStr();
    }
}
