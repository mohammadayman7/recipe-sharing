package com.example.recipesharing.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "comment")
@Data
@Getter
@Setter
public class comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentID;
    @ManyToOne
    @JoinColumn(name = "userID")
    private user user;

    @ManyToOne
    @JoinColumn(name = "recipeID")
    private com.example.recipesharing.Entities.recipe recipe;
    private String Text;
    private LocalDateTime Timestamp;



}
