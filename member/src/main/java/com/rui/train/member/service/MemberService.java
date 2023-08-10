package com.rui.train.member.service;

import cn.hutool.core.collection.CollUtil;
import com.rui.train.member.domain.Member;
import com.rui.train.member.domain.MemberExample;
import com.rui.train.member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/10 19:09
 * @Version 1.0
 */
@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public int count(){
        return Math.toIntExact(memberMapper.countByExample(null));
    }

    public long register(String mobile){
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andMobileEqualTo(mobile);
        List<Member> list = memberMapper.selectByExample(memberExample);

        if (CollUtil.isNotEmpty(list)){
//            return list.get(0).getId();
            throw new RuntimeException("手机号已注册");
        }

        Member member = new Member();
        member.setId(System.currentTimeMillis());
        member.setMobile(mobile);
        memberMapper.insert(member);
        return member.getId();

    }
}
