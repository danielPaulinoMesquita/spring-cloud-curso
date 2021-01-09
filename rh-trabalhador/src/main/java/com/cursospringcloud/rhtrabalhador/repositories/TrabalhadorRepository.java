package com.cursospringcloud.rhtrabalhador.repositories;

import com.cursospringcloud.rhtrabalhador.entities.Trabalhador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long> {
}
