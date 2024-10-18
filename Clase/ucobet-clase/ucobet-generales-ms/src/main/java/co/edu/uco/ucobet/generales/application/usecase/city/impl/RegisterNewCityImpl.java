package co.edu.uco.ucobet.generales.application.usecase.city.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.generales.application.secondaryports.entity.CityEntity;
import co.edu.uco.ucobet.generales.application.secondaryports.mapper.repository.CityRepository;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCity;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityRulesValidator;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;

@Service
public final class RegisterNewCityImpl implements RegisterNewCity{

	private CityRepository cityRepository;
	private RegisterNewCityRulesValidator registerNewCityRulesValidator;
	
	
	public RegisterNewCityImpl(final CityRepository cityRepository,
			final RegisterNewCityRulesValidator registerNewCityRulesValidator) {
		this.cityRepository = cityRepository;
		this.registerNewCityRulesValidator = registerNewCityRulesValidator;
	}


	@Override
	public void execute(final CityDomain domain) {
		
		//Rules validation 
		registerNewCityRulesValidator.validate(domain);
		//DataMapper -> Domain -> Entity 
		final var cityEntity = CityEntity.create(null);
		
		// Save city Entity 
		cityRepository.save(cityEntity);
		// Notificar al administrador sobre ña ccreacion de la nueva ciudad 
		// Building block 
		//correo del administrador esta en un lugar parametizado (traer de parameters building block)
		// el asunto del correo esta en un luigar parametrizado 
		// el puerto del correo esta en un lugar parametizado (parameters building block) 
	}

	
}
