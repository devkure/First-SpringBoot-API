package com.springboot_jb.jbsbt.service;

import com.springboot_jb.jbsbt.api.model.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    //simulated database - this should be linked to some kind of database such as mysql db or whatever else
    private List<Member> memberList;

    public MemberService() {
        this.memberList = new ArrayList<>();

        Member member1 = new Member(1, "Jan", "Brzeziński", "Tobi", "Brzezinskijan99@gmail.com", "MagicMan");
        Member member2 = new Member(2, "Tomek", "Tomili", "Tomur", "tomcat@kochamapache.pl", "Coder");
        Member member3 = new Member(3, "Mikolaj", "Ziolson", "Ziolek", "kochamapi@wupe.pl", "Coder");
        Member member4 = new Member(4, "Artur", "Kuś", "Bonesik", "Bbones@gmail.com", "Animator");
        Member member5 = new Member(5, "Julian", "Licz", "KloniLiczKing", "Kloniszcze@minecraft.com", "Coder");
        Member member6 = new Member(6, "Weronika", "Pe", "Nika", "animozje@gmail.com", "Musician");

        memberList.addAll(Arrays.asList(member1, member2, member3, member4, member5, member6));
    }

    public Optional<Member> getMember(Integer id) {
        Optional optional = Optional.empty();
        for (Member mem : memberList) {
            if (id == mem.getId()) {
                optional = Optional.of(mem);
                return optional;
            }
        }
        return optional;
    }

    //DEBUG
    public Member test() {
        //return "it worked!";
        return memberList.get(0);
    }
}
