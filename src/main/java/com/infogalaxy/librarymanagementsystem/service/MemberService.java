package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.LibraryMemberEntity;
import com.infogalaxy.librarymanagementsystem.exception.MemberNotFounfException;
import com.infogalaxy.librarymanagementsystem.repo.IMemberRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService implements IMemberService {

    /**
     * To Create Object of Member Repo Interface
     */
    @Autowired
    IMemberRepo iMemberRepo;

    /**
     * Method to Add New Member Data in Database
     *
     * @param libraryMemberEntity -  Object of LibraryMemberEntity
     * @return - libraryMemberEntity - Object of LibraryMemberEntity(Member)
     */
    @Override
    public LibraryMemberEntity createMember(LibraryMemberEntity libraryMemberEntity) {
        iMemberRepo.save(libraryMemberEntity);
        return libraryMemberEntity;
    }

    /**
     * Method to Retrieve All Members Data From Database
     *
     * @return List - List of LibraryMemberEntity Objects
     */
    @Override
    public List<LibraryMemberEntity> retriveMember() {
        return iMemberRepo.findAll();
    }

    /**
     * Method to Retrieve Member Data From Database with the help of Member ID
     *
     * @param id -  Find the Member Data By the given ID
     * @return Find the Member Data By the given ID
     */
    @Override
    public Optional<LibraryMemberEntity> retriveMemberbyid(int id) {
        Optional<LibraryMemberEntity> libraryMemberEntity = iMemberRepo.findById(id);
        if (libraryMemberEntity.isPresent()) {
            return libraryMemberEntity;
        }
        throw new MemberNotFounfException("Member with Given ID is not Found in Database");
    }

    /**
     * Method to Delete existing Member Data with the help of Member ID
     *
     * @param id - Method to Delete existing Member Data with the help of Member ID
     * @return -- Display the Delete Successfully message
     */
    @Override
    public String deleteMemberbyid(int id) {
        Optional<LibraryMemberEntity> libraryMemberEntity = iMemberRepo.findById(id);

        if (libraryMemberEntity.isPresent()) {
            iMemberRepo.deleteById(id);
            return "Member Data Deleted By ID Successfully..";
        }
        throw new MemberNotFounfException("Member with Given ID is not Found in Database");
    }

    /**
     * Method to Retrieve Member Data From Database with the help of Member ID
     *
     * @param id - Find the Member Data By the given ID
     * @return libraryMemberEntity-LibraryMemberEntity Object with the help of Member ID
     */
    @Override
    public LibraryMemberEntity updateMemberById(int id, LibraryMemberEntity libraryMemberEntity) {
        Optional<LibraryMemberEntity> libraryMemberEntitynew = iMemberRepo.findById(id);
        if (libraryMemberEntitynew.isPresent()) {
            BeanUtils.copyProperties(libraryMemberEntity, libraryMemberEntitynew);
            return iMemberRepo.save(libraryMemberEntity);
        } else {
            throw new MemberNotFounfException("Member with Given ID is not Found in Database..");
        }
    }
}
