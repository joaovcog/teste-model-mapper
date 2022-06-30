package com.teste.modelmapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.modelmapper.model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {

}
