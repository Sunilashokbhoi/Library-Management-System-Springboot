package com.infogalaxy.librarymanagementsystem.controller;

import com.infogalaxy.librarymanagementsystem.entity.LibraryMemberEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member/api")
public class LibraryMemberController {

    @GetMapping("/home")
    public String libraryMember(){
        return "welcome To Library Member API ";
    }

}
