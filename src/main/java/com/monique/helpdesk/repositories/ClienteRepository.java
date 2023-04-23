package com.monique.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monique.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
