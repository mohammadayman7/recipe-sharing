package com.example.recipesharing.Repository;

import com.example.recipesharing.Entities.ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<ingredient,Long> {
}
