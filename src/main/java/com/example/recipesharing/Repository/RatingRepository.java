package com.example.recipesharing.Repository;

import com.example.recipesharing.Entities.rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<rating,Long> {
}
