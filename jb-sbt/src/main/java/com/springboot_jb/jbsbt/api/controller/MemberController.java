package com.springboot_jb.jbsbt.api.controller;

import com.springboot_jb.jbsbt.api.model.Member;
import com.springboot_jb.jbsbt.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
    @GetMapping("/member")
    public Optional<Member> getMember(@RequestParam Integer id){
        Optional member = memberService.getMember(id);
        if(member.isPresent()){
            return memberService.getMember(id);
        }
        return null;
    }

    //DEBUG
    @GetMapping("/test")
    public Member test(){
        return memberService.test();
    }
}
