package com.infogalaxy.librarymanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name="authorentity")
public class AuthorEntity {
    @Id
    private int authorid;
    @NotBlank(message = "Please Enter the author name :")
    private String authorname;
    @NotBlank(message = "Please Enter the Author Country: ")
    private String authorcountry;
}
