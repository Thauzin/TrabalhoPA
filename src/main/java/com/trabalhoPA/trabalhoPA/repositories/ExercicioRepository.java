package com.seuprojeto.repository;

import com.seuprojeto.model.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercicioRepository extends JpaRepository<Exercicio, Integer> {
}
