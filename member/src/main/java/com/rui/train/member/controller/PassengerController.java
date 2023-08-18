package com.rui.train.member.controller;

import com.github.pagehelper.Page;
import com.rui.train.common.context.LoginMemberContext;
import com.rui.train.common.resp.CommonResp;
import com.rui.train.common.resp.PageResp;
import com.rui.train.member.req.PassengerQueryReq;
import com.rui.train.member.req.PassengerSaveReq;
import com.rui.train.member.resp.PassengerQueryResp;
import com.rui.train.member.service.MemberService;
import com.rui.train.member.service.PassengerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/12 17:01
 * @Version 1.0
 */
@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/save")
    public CommonResp<Object> save(@Valid @RequestBody PassengerSaveReq req) {
        passengerService.save(req);
        return new CommonResp<>();
    }

    @GetMapping("/query-list")
    public CommonResp<PageResp<PassengerQueryResp>> queryList(@Valid PassengerQueryReq req) {
        req.setMemberId(LoginMemberContext.getId());
        PageResp<PassengerQueryResp> list = passengerService.queryList(req);
        return new CommonResp<>(list);
    }

    @DeleteMapping("/delete/{id}")
    public CommonResp<Object> delete(@PathVariable Long id){
        passengerService.delete(id);
        return new CommonResp<>();
    }

    @GetMapping("/query-mine")
    public CommonResp<List<PassengerQueryResp>> queryMine() {
        List<PassengerQueryResp> list = passengerService.queryMine();
        return new CommonResp<>(list);
    }
}
