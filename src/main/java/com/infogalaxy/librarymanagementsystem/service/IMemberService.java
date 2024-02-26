package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.LibraryMemberEntity;

import java.util.List;
import java.util.Optional;

/**
 * IMemberService Interface is used to Declare the Library Member Functions
 */

public interface IMemberService {

    public LibraryMemberEntity createMember(LibraryMemberEntity libraryMember);

    public List<LibraryMemberEntity> retriveMember();

    public Optional<LibraryMemberEntity> retriveMemberbyid(int id);

    public String deleteMemberbyid(int id);
    
    public LibraryMemberEntity updateMemberById(int id,LibraryMemberEntity libraryMemberEntity);
}