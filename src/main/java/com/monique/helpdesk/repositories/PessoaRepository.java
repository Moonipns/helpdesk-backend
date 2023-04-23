package com.monique.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monique.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
