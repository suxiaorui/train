package com.rui.train.business.controller.admin;

import com.rui.train.business.req.DailyTrainQueryReq;
import com.rui.train.business.req.DailyTrainSaveReq;
import com.rui.train.business.resp.DailyTrainQueryResp;
import com.rui.train.business.service.DailyTrainService;
import com.rui.train.common.resp.CommonResp;
import com.rui.train.common.resp.PageResp;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/17 14:20
 * @Version 1.0
 */
@RestController
@RequestMapping("/admin/daily-train")
public class DailyTrainAdminController {

    @Resource
    private DailyTrainService dailyTrainService;

    @PostMapping("/save")
    public CommonResp<Object> save(@Valid @RequestBody DailyTrainSaveReq req) {
        dailyTrainService.save(req);
        return new CommonResp<>();
    }

    @GetMapping("/query-list")
    public CommonResp<PageResp<DailyTrainQueryResp>> queryList(@Valid DailyTrainQueryReq req) {
        PageResp<DailyTrainQueryResp> list = dailyTrainService.queryList(req);
        return new CommonResp<>(list);
    }

    @DeleteMapping("/delete/{id}")
    public CommonResp<Object> delete(@PathVariable Long id) {
        dailyTrainService.delete(id);
        return new CommonResp<>();
    }

}

