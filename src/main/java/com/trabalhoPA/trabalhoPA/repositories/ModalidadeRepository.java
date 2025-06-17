package com.trabalhoPA.trabalhoPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalhoPA.trabalhoPA.models.Modalidade;
import java.util.List;


@Repository
public interface ModalidadeRepository extends JpaRepository<Modalidade, Long> {
    List<Modalidade> findByIdadeMinima(int idadeMinima);
}
