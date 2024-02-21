package com.infogalaxy.librarymanagementsystem.controller;

import com.infogalaxy.librarymanagementsystem.entity.LibraryMemberEntity;
import com.infogalaxy.librarymanagementsystem.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("member/api")
public class LibraryMemberController {

    @Autowired
    IMemberService memberService;

    @GetMapping("/home")
    public String libraryMember(){
        return "welcome To Library Member API ";
    }

    @PostMapping("/createmember")
    public LibraryMemberEntity createMember(@RequestBody LibraryMemberEntity libraryMemberEntity){
    return memberService.createMember(libraryMemberEntity);
    }

    @GetMapping("/retriveMember")
    public List<LibraryMemberEntity> retriveMember(){
        return memberService.retriveMember();
    }

    @GetMapping("/retrivememberbyid/{id}")
    public LibraryMemberEntity retriveMemberbyid(@PathVariable ("id") int id){
        return memberService.retriveMemberbyid(id);
    }
}
