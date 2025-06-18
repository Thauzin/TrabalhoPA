package com.trabalhoPA.trabalhoPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trabalhoPA.trabalhoPA.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
