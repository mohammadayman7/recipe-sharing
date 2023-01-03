package com.example.recipesharing.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ingredient")
@Data
public class ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ingredientID;
    @ManyToOne
    @JoinColumn(name = "recipeID")
    private com.example.recipesharing.Entities.recipe recipe;
    private String Name;
    private Double Quantity;
    private String Unit;

}
