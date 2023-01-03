package com.example.recipesharing.Repository;

import com.example.recipesharing.Entities.recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<recipe,Long> {
}
