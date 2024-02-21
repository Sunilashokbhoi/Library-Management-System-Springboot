package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.LibraryMemberEntity;

import java.util.List;

public interface IMemberService {

    public LibraryMemberEntity createMember(LibraryMemberEntity libraryMember);

    public List<LibraryMemberEntity> retriveMember();

    public LibraryMemberEntity retriveMemberbyid(int id);
}

