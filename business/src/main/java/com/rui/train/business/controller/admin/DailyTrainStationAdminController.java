package com.rui.train.business.controller.admin;

import com.rui.train.business.req.DailyTrainStationQueryReq;
import com.rui.train.business.req.DailyTrainStationSaveReq;
import com.rui.train.business.resp.DailyTrainStationQueryResp;
import com.rui.train.business.service.DailyTrainStationService;
import com.rui.train.common.resp.CommonResp;
import com.rui.train.common.resp.PageResp;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/17 15:51
 * @Version 1.0
 */
@RestController
@RequestMapping("/admin/daily-train-station")
public class DailyTrainStationAdminController {

    @Resource
    private DailyTrainStationService dailyTrainStationService;

    @PostMapping("/save")
    public CommonResp<Object> save(@Valid @RequestBody DailyTrainStationSaveReq req) {
        dailyTrainStationService.save(req);
        return new CommonResp<>();
    }

    @GetMapping("/query-list")
    public CommonResp<PageResp<DailyTrainStationQueryResp>> queryList(@Valid DailyTrainStationQueryReq req) {
        PageResp<DailyTrainStationQueryResp> list = dailyTrainStationService.queryList(req);
        return new CommonResp<>(list);
    }

    @DeleteMapping("/delete/{id}")
    public CommonResp<Object> delete(@PathVariable Long id) {
        dailyTrainStationService.delete(id);
        return new CommonResp<>();
    }

}

