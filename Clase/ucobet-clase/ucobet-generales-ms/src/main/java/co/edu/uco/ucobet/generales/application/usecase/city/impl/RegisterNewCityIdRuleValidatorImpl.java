package co.edu.uco.ucobet.generales.application.usecase.city.impl;


import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityIdRulesValidator;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.city.exception.CityIdDoesExistsException;
import co.edu.uco.ucobet.generales.domain.city.rules.CityIdDoesNotExistsRule;


public final class RegisterNewCityIdRuleValidatorImpl implements RegisterNewCityIdRulesValidator{

	private CityIdDoesNotExistsRule cityIdDoesExistsRule;
	
	
	
	public RegisterNewCityIdRuleValidatorImpl(CityIdDoesNotExistsRule cityIdDoesExistsRule) {
		this.cityIdDoesExistsRule = cityIdDoesExistsRule;
	}



	@Override
	public void validate(CityDomain data) {
		try {
			data.generateId();
			cityIdDoesExistsRule.validate(data.getId());
		}catch (final CityIdDoesExistsException exception) {
			validate(data);
		}
	}
	
}
