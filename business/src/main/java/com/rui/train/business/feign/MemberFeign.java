package com.rui.train.business.feign;

import com.rui.train.common.req.MemberTicketReq;
import com.rui.train.common.resp.CommonResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/20 17:41
 * @Version 1.0
 */
@FeignClient(name = "member", url = "http://127.0.0.1:8001")
public interface MemberFeign {

    @GetMapping("/member/feign/ticket/save")
    CommonResp<Object> save(@RequestBody MemberTicketReq req);

}
