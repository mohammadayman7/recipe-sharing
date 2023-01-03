package com.example.recipesharing.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "category")
public class category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryID;

    @ManyToMany(mappedBy = "categories")
    private List<recipe> recipes;
    private String Name;
}
