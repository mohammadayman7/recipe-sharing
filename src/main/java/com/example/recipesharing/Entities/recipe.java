package com.example.recipesharing.Entities;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "recipe")
@Data
public class recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipeID;
    @ManyToOne
    @JoinColumn(name = "userID")
    private user user;
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<ingredient> ingredients;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "recipe_category",
            joinColumns = @JoinColumn(name = "recipeID"),
            inverseJoinColumns = @JoinColumn(name = "categoryID")
    )
    private List<category> categories;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<comment> comments;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<rating> ratings;
    private String Title;
    private String Description;
    private String Instructions;
    private LocalDateTime  PrepTime;
    private LocalDateTime CookTime;
    private Double Servings;

}
