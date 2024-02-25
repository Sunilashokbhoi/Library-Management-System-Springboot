package com.infogalaxy.librarymanagementsystem.controller;

import com.infogalaxy.librarymanagementsystem.entity.LibraryMemberEntity;
import com.infogalaxy.librarymanagementsystem.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("member/api")
public class LibraryMemberController {

    /***
     * To Create Object Of Member Service Interface
     * */

    @Autowired
    IMemberService memberService;

    /**
     *
     * @return String - Welcome to Library Member API
     */

    @GetMapping("/home")
    public String libraryMember(){
        return "welcome To Library Member API ";
    }

    /**
     * API to create Member Data in Database
     * @param libraryMemberEntity - Object Of LibraryMemberEntity
     * @return - LibraryMemberEntity Object
     */

    @PostMapping("/createmember")
    public LibraryMemberEntity createMember(@RequestBody LibraryMemberEntity libraryMemberEntity){
    return memberService.createMember(libraryMemberEntity);
    }

    /**
     * API to retrieve all member Data in Databse
     * @return LibraryMemnerEntity Object Return
     */

    @GetMapping("/retriveMember")
    public List<LibraryMemberEntity> retriveMember(){
        return memberService.retriveMember();
    }

    /**
     * API to Retrieve the existing Member Data from Database with the help of Member ID
     * @param id -  Find the Member Data By the given ID
     * @return  LibraryMemnerEntity Object Return
     */

    @GetMapping("/retrivememberbyid/{id}")
    public LibraryMemberEntity retriveMemberbyid(@PathVariable ("id") int id){
        return memberService.retriveMemberbyid(id);
    }

    /**
     *  API to Delete existing Member Data from Database with the help of Member ID
     *   @param id - Find the Member Data By the given ID
     */


    @DeleteMapping("/deletememberbyid/{id}")
    public String deleteMemberbyid(@PathVariable("id") int id){
        return memberService.deleteMemberbyid(id);
    }

    /**
     *  API to Update existing member data in database with the help of member ID
     * @param id - Find the Member Data By the given ID
     * @param libraryMemberEntity - Object of LibraryMemberEntity
     * @return - LibraryMemnerEntity Object Return
     */

    @PutMapping("/updatememberbyid/{id}")
    public LibraryMemberEntity updateMemberById(@PathVariable("id")int id,@RequestBody LibraryMemberEntity libraryMemberEntity){
        return memberService.updateMemberById(id,libraryMemberEntity);
    }
}
