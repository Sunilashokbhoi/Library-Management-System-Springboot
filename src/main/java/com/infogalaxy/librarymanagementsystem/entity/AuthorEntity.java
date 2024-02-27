package com.infogalaxy.librarymanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="librarymemberentity")
public class AuthorEntity {
    @Id
    private int authirid;
    private String authorname;
    private String authorcountry;
}
