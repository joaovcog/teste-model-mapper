package com.teste.modelmapper.dto;

import lombok.Data;

@Data
public class AtividadeDto {
	
	private Long codigo;
	private String descricao;
	private Long duracao;
	
	private AtividadeDto atividadeDependente;
	
}
