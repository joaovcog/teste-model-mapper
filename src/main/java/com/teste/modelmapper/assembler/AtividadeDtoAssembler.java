package com.teste.modelmapper.assembler;

import org.springframework.stereotype.Component;

import com.teste.modelmapper.dto.AtividadeDto;
import com.teste.modelmapper.model.Atividade;

@Component
public class AtividadeDtoAssembler extends GenericInputOutputAssembler<Atividade, AtividadeDto, AtividadeDto> {
	
}