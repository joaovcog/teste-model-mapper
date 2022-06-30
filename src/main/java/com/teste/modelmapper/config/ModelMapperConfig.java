package com.teste.modelmapper.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.teste.modelmapper.dto.AtividadeDto;
import com.teste.modelmapper.model.Atividade;

@Configuration
public class ModelMapperConfig {
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setAmbiguityIgnored(true);
		
//		modelMapper.createTypeMap(Atividade.class, AtividadeDto.class)
//			.addMapping(Atividade::getAtividadeDependente, AtividadeDto::setAtividadeDependente);
		
		return modelMapper;
	}
}