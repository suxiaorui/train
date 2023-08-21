package com.rui.train.business.controller.admin;

import com.rui.train.business.req.SkTokenQueryReq;
import com.rui.train.business.req.SkTokenSaveReq;
import com.rui.train.business.resp.SkTokenQueryResp;
import com.rui.train.business.service.SkTokenService;
import com.rui.train.common.resp.CommonResp;
import com.rui.train.common.resp.PageResp;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/22 0:04
 * @Version 1.0
 */
@RestController
@RequestMapping("/admin/sk-token")
public class SkTokenAdminController {

    @Resource
    private SkTokenService skTokenService;

    @PostMapping("/save")
    public CommonResp<Object> save(@Valid @RequestBody SkTokenSaveReq req) {
        skTokenService.save(req);
        return new CommonResp<>();
    }

    @GetMapping("/query-list")
    public CommonResp<PageResp<SkTokenQueryResp>> queryList(@Valid SkTokenQueryReq req) {
        PageResp<SkTokenQueryResp> list = skTokenService.queryList(req);
        return new CommonResp<>(list);
    }

    @DeleteMapping("/delete/{id}")
    public CommonResp<Object> delete(@PathVariable Long id) {
        skTokenService.delete(id);
        return new CommonResp<>();
    }

}

