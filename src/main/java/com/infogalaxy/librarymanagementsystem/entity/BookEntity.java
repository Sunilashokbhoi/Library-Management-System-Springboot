package com.infogalaxy.librarymanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BookEntity {
    @Id
    private int bookid;
    private String booktitle;
    private String bookauthorname;
    private int bookprice;
    private String bookisbn;
    private int bookpublishyear;

    }
