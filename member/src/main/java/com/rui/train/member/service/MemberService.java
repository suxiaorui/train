package com.rui.train.member.service;

import com.rui.train.member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
