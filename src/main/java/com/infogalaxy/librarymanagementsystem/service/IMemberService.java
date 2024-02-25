package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.LibraryMemberEntity;

import java.util.List;

/**
 * IMemberService Interface is used to Declare the Library Member Functions
 */

public interface IMemberService {

    public LibraryMemberEntity createMember(LibraryMemberEntity libraryMember);

    public List<LibraryMemberEntity> retriveMember();

    public LibraryMemberEntity retriveMemberbyid(int id);

    public String deleteMemberbyid(int id);
    
    public LibraryMemberEntity updateMemberById(int id,LibraryMemberEntity libraryMemberEntity);
}