package com.trabalhoPA.trabalhoPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trabalhoPA.trabalhoPA.models.Academia;

public interface AcademiaRepository extends JpaRepository<Academia, String> {
}