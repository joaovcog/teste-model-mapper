package com.teste.modelmapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.modelmapper.assembler.AtividadeDtoAssembler;
import com.teste.modelmapper.dto.AtividadeDto;
import com.teste.modelmapper.exception.EntidadeNaoEncontradaException;
import com.teste.modelmapper.model.Atividade;
import com.teste.modelmapper.repository.AtividadeRepository;

@RestController
@RequestMapping("atividades")
public class AtividadeController {
	
	@Autowired
	private AtividadeRepository atividadeRepository;
	
	@Autowired
	private AtividadeDtoAssembler atividadeDtoAssembler;
	
	@GetMapping(path = "/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public AtividadeDto buscarPorCodigo(@PathVariable Long codigo) {
		Atividade atividade = atividadeRepository.findById(codigo).orElseThrow(() -> 
			new EntidadeNaoEncontradaException("Entidade não encontrada"));
		
		return atividadeDtoAssembler.toOutputDtoFromDomainEntity(atividade);
	}
	
	
}
