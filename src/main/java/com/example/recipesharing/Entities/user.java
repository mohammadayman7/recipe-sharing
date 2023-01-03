package com.example.recipesharing.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "user")
@Data
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<recipe> recipes;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<comment> comments;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<rating> ratings;
    private String Name;
    private String Email;
    private String Password;

}
