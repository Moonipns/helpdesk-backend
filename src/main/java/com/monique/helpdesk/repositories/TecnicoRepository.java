package com.monique.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monique.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
