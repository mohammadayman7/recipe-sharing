package com.example.recipesharing.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "rating")
public class rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ratingID;

    @ManyToOne
    @JoinColumn(name = "userID")
    private user user;

    @ManyToOne
    @JoinColumn(name = "recipeID")
    private com.example.recipesharing.Entities.recipe recipe;
    private int Value;

}