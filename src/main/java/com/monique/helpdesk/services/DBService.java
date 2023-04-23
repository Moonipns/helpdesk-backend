package com.monique.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monique.helpdesk.domain.Chamado;
import com.monique.helpdesk.domain.Cliente;
import com.monique.helpdesk.domain.Tecnico;
import com.monique.helpdesk.domain.enums.Perfil;
import com.monique.helpdesk.domain.enums.Prioridade;
import com.monique.helpdesk.domain.enums.Status;
import com.monique.helpdesk.repositories.ChamadoRepository;
import com.monique.helpdesk.repositories.ClienteRepository;
import com.monique.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Monique Nunes", "31397127236", "monique@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Everton Lima", "57667088748", "everton@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
