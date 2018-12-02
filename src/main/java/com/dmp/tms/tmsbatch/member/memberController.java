package com.dmp.tms.tmsbatch.member;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@EnableAutoConfiguration
@Slf4j
@AllArgsConstructor
public class memberController {

    private MemberMapper memberMapper;

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        List<MemberVo> memberVoList = memberMapper.selectMembers();
        memberVoList.forEach(memberVo ->
            log.debug(memberVo.toString())
        );
        return "hello members";
    }
}
