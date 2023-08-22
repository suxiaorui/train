package com.rui.train.business.controller;

import com.rui.train.business.req.ConfirmOrderDoReq;
import com.rui.train.business.service.BeforeConfirmOrderService;
import com.rui.train.business.service.ConfirmOrderService;
import com.rui.train.common.resp.CommonResp;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/18 22:06
 * @Version 1.0
 */
@RestController
@RequestMapping("/confirm-order")
public class ConfirmOrderController {

    private static final Logger LOG = LoggerFactory.getLogger(ConfirmOrderController.class);


    @Resource
    private BeforeConfirmOrderService beforeConfirmOrderService;

    @PostMapping("/do")
    public CommonResp<Object> doConfirm(@Valid @RequestBody ConfirmOrderDoReq req) {
        beforeConfirmOrderService.beforeDoConfirm(req);
        return new CommonResp<>();
    }
}

