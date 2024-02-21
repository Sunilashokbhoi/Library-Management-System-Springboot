package com.infogalaxy.librarymanagementsystem.repo;

import com.infogalaxy.librarymanagementsystem.controller.LibraryMemberController;
import com.infogalaxy.librarymanagementsystem.entity.LibraryMemberEntity;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMemberRepo extends JpaRepository<LibraryMemberEntity,Integer> {
}
