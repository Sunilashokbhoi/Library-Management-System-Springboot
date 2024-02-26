package com.infogalaxy.librarymanagementsystem.controller;

import com.infogalaxy.librarymanagementsystem.entity.LibraryMemberEntity;
import com.infogalaxy.librarymanagementsystem.responses.Responses;
import com.infogalaxy.librarymanagementsystem.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
     * @return - Custome Responses -  Custom Response object with response data
     */

    @PostMapping("/createmember")
    public ResponseEntity<?> createMember(@RequestBody LibraryMemberEntity libraryMemberEntity){
    return new ResponseEntity<>(new Responses("Created Member Data", HttpStatus.CREATED,memberService.createMember(libraryMemberEntity)),HttpStatus.CREATED);
    }

    /**
     * API to retrieve all member Data in Databse
     * @return Custome Responses List Of Objects
     */

    @GetMapping("/retriveMember")
    public ResponseEntity<?> retriveMember(){
        return new ResponseEntity<>(new Responses("Retrive All Data Members ",HttpStatus.FOUND, memberService.retriveMember()),HttpStatus.FOUND);
    }

    /**
     * API to Retrieve the existing Member Data from Database with the help of Member ID
     * @param id -  Find the Member Data By the given ID
     * @return  Custome Responses object with Response Data
     */

    @GetMapping("/retrivememberbyid/{id}")
    public ResponseEntity<?> retriveMemberbyid(@PathVariable ("id") int id){
        return new ResponseEntity<>(new Responses("Member Data Found By Given ID",HttpStatus.FOUND,memberService.retriveMemberbyid(id)),HttpStatus.FOUND);
    }

    /**
     *  API to Delete existing Member Data from Database with the help of Member ID
     *   @param id - Find the Member Data By the given ID
     *   @return - Response message of Deletion
     */


    @DeleteMapping("/deletememberbyid/{id}")
    public ResponseEntity<?> deleteMemberbyid(@PathVariable("id") int id){
        return new ResponseEntity<>(new Responses("Deleted Member Data Successfully...",HttpStatus.ACCEPTED, memberService.deleteMemberbyid(id)),HttpStatus.ACCEPTED);
    }

    /**
     *  API to Update existing member data in database with the help of member ID
     * @param id - Find the Member Data By the given ID
     * @param libraryMemberEntity - Object of LibraryMemberEntity
     * @return - Custom response Updated object with response data
     */

    @PutMapping("/updatememberbyid/{id}")
    public ResponseEntity<?> updateMemberById(@PathVariable("id")int id,@RequestBody LibraryMemberEntity libraryMemberEntity){
        return new ResponseEntity<>(new Responses("Update Member Data Successfully..",HttpStatus.ACCEPTED,memberService.updateMemberById(id,libraryMemberEntity)),HttpStatus.ACCEPTED) ;
    }
}
