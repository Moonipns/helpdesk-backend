package com.monique.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monique.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
