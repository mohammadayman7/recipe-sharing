package com.example.recipesharing.Repository;

import com.example.recipesharing.Entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user,Long> {
}
