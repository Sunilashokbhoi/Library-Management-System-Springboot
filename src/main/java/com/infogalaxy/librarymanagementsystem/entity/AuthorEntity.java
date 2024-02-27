package com.infogalaxy.librarymanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class AuthorEntity {
    @Id
    private int authirid;
    private String authorname;
    private String authorcountry;
}
