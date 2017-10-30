package com.vasthierarchy.db.repository;

import com.vasthierarchy.db.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
