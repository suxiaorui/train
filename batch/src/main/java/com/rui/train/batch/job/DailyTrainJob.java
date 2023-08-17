package com.rui.train.batch.job;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import com.rui.train.batch.feign.BusinessFeign;
import com.rui.train.common.resp.CommonResp;
import jakarta.annotation.Resource;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.Date;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/17 16:57
 * @Version 1.0
 */
@DisallowConcurrentExecution
public class DailyTrainJob implements Job {

    private static final Logger LOG = LoggerFactory.getLogger(DailyTrainJob.class);


    @Resource
    BusinessFeign businessFeign;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // 增加日志流水号
        MDC.put("LOG_ID", System.currentTimeMillis() + RandomUtil.randomString(3));
        LOG.info("生成15天后的车次数据开始");
        Date date = new Date();
        DateTime dateTime = DateUtil.offsetDay(date, 15);
        Date offsetDate = dateTime.toJdkDate();
        CommonResp<Object> commonResp = businessFeign.genDaily(offsetDate);
        LOG.info("生成15天后的车次数据结束,结果：{}", commonResp);
    }
}
