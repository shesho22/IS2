package co.edu.uco.ucobet.generales.application.primaryports.interactor.city.impl;

import co.edu.uco.ucobet.generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCity;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;

public final class RegisterNewCityInteractorImpl implements RegisterNewCityInteractor{
	
	private RegisterNewCity registerNewCity;
	
	public RegisterNewCityInteractorImpl(final RegisterNewCity registerNewCity) {
		this.registerNewCity = registerNewCity;
	}
	
	@Override
	public void execute(final RegisterNewCityDTO data) {
		// Data mapper -> Dto -> domain 
		final var cityDomain = new CityDomain(null, null, null);
		registerNewCity.execute(cityDomain);
	}

}
