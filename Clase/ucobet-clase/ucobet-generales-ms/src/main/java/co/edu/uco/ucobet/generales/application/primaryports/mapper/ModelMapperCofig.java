package co.edu.uco.ucobet.generales.application.primaryports.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperCofig {
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
