package com.rui.train.business.controller.admin;

import com.rui.train.business.req.TrainCarriageQueryReq;
import com.rui.train.business.req.TrainCarriageSaveReq;
import com.rui.train.business.resp.TrainCarriageQueryResp;
import com.rui.train.business.service.TrainCarriageService;
import com.rui.train.common.resp.CommonResp;
import com.rui.train.common.resp.PageResp;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/16 18:16
 * @Version 1.0
 */
@RestController
@RequestMapping("/admin/train-carriage")
public class TrainCarriageAdminController {

    @Resource
    private TrainCarriageService trainCarriageService;

    @PostMapping("/save")
    public CommonResp<Object> save(@Valid @RequestBody TrainCarriageSaveReq req) {
        trainCarriageService.save(req);
        return new CommonResp<>();
    }

    @GetMapping("/query-list")
    public CommonResp<PageResp<TrainCarriageQueryResp>> queryList(@Valid TrainCarriageQueryReq req) {
        PageResp<TrainCarriageQueryResp> list = trainCarriageService.queryList(req);
        return new CommonResp<>(list);
    }

    @DeleteMapping("/delete/{id}")
    public CommonResp<Object> delete(@PathVariable Long id) {
        trainCarriageService.delete(id);
        return new CommonResp<>();
    }

}

