package co.edu.uco.ucobet.generales.application.primaryports.interactor.city.impl;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import co.edu.uco.ucobet.generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCity;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;

public final class RegisterNewCityInteractorImpl implements RegisterNewCityInteractor{
	
	private RegisterNewCity registerNewCity;
	
	@Autowired
	ModelMapper modelMapper;
	
	public RegisterNewCityInteractorImpl(final RegisterNewCity registerNewCity) {
		this.registerNewCity = registerNewCity;
	}
	
	@Override
	public void execute(final RegisterNewCityDTO data) {
		// Data mapper -> Dto -> domain 
		final var cityDomain = dtoToDomain(data);
		registerNewCity.execute(cityDomain);
	}
	
	
	
	public CityDomain dtoToDomain(RegisterNewCityDTO dto) {
		return modelMapper.map(dto,CityDomain.class);
		
	}


}
