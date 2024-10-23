package co.edu.uco.ucobet.generales.application.usecase.city.impl;


import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityNameRulesValidator;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameForStateDoesNotExistsRule;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameFormatIsValidRule;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameIsNotNullRule;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameLenghtIsValidRule;



public final class RegisterNewCityNameRuleValidatorImpl implements RegisterNewCityNameRulesValidator{

	
	private CityNameIsNotNullRule cityNameIsNotNullRule;
	private CityNameLenghtIsValidRule cityNameLenghtIsValidRule;
	private CityNameFormatIsValidRule cityNameFormatIsValidRule;
	private CityNameForStateDoesNotExistsRule cityNameForStateDoesNotExistsRule;
	

	
	
	public RegisterNewCityNameRuleValidatorImpl(CityNameIsNotNullRule cityNameIsNotNullRule,
			CityNameLenghtIsValidRule cityNameLenghtIsValidRule, CityNameFormatIsValidRule cityNameFormatIsValidRule,
			CityNameForStateDoesNotExistsRule cityNameForStateDoesNotExistsRule) {
		this.cityNameIsNotNullRule = cityNameIsNotNullRule;
		this.cityNameLenghtIsValidRule = cityNameLenghtIsValidRule;
		this.cityNameFormatIsValidRule = cityNameFormatIsValidRule;
		this.cityNameForStateDoesNotExistsRule = cityNameForStateDoesNotExistsRule;
	}




	@Override
	public void validate(CityDomain data) {
		cityNameIsNotNullRule.validate(data.getName());		
		cityNameIsNotNullRule.validate(data.getName());
		cityNameLenghtIsValidRule.validate(data.getName());
		cityNameFormatIsValidRule.validate(data.getName());
		cityNameForStateDoesNotExistsRule.validate(data);
	}
	

}
