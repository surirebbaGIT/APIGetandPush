package com.vasthierarchy.db.repository;

import com.vasthierarchy.db.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Integer> {
}