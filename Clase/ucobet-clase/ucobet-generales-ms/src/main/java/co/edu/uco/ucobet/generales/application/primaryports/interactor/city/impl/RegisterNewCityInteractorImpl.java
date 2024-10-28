package co.edu.uco.ucobet.generales.application.primaryports.interactor.city.impl;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCity;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;

@Service
public final class RegisterNewCityInteractorImpl implements RegisterNewCityInteractor{
	
	private RegisterNewCity registerNewCity;
	private ModelMapper modelMapper;
	
	public RegisterNewCityInteractorImpl(final RegisterNewCity registerNewCity, final ModelMapper modelMapper) {
	    this.registerNewCity = registerNewCity;
	    this.modelMapper = modelMapper;
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
