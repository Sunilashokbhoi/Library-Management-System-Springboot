package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.LibraryMemberEntity;
import com.infogalaxy.librarymanagementsystem.repo.IMemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements IMemberService {
    @Autowired
    IMemberRepo iMemberRepo;

    @Override
    public LibraryMemberEntity createMember(LibraryMemberEntity libraryMemberEntity) {
        iMemberRepo.save(libraryMemberEntity);
        return libraryMemberEntity;
    }

    @Override
    public List<LibraryMemberEntity> retriveMember() {
        return iMemberRepo.findAll();
    }

    @Override
    public LibraryMemberEntity retriveMemberbyid(int id) {
        return iMemberRepo.findById(id).get();
    }

    @Override
    public String deleteMemberbyid(int id) {

        iMemberRepo.deleteById(id);
        return "Member Data Deleted By ID Successfully..";
    }

}