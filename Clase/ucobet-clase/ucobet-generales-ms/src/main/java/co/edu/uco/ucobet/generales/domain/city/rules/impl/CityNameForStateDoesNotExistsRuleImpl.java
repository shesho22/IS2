package co.edu.uco.ucobet.generales.domain.city.rules.impl;



import co.edu.uco.ucobet.generales.application.secondaryports.repository.CityRepository;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameForStateDoesNotExistsRule;

public final class CityNameForStateDoesNotExistsRuleImpl implements CityNameForStateDoesNotExistsRule{

	private CityRepository cityRepository;
	
	public CityNameForStateDoesNotExistsRuleImpl(final CityRepository cityRepository) {
		this.cityRepository =cityRepository;
	}

	@Override
	public void validate(CityDomain data) {
		// TODO Auto-generated method stub
		
	}
	


}
