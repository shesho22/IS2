package co.edu.uco.ucobet.generales.application.usecase.city.impl;



import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityRulesValidator;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;


public final class RegisterNewCityRuleValidatorImpl implements RegisterNewCityRulesValidator{

	public RegisterNewCityIdRuleValidatorImpl registerNewCityIdRuleValidatorImpl;
	public RegisterNewCityNameRuleValidatorImpl registerNewCityNameRuleValidatorImpl;
	public RegisterNewCityStateRuleValidatorImpl registerNewCityStateRuleValidatorImpl;

	public RegisterNewCityRuleValidatorImpl(RegisterNewCityIdRuleValidatorImpl registerNewCityIdRuleValidatorImpl,
			RegisterNewCityNameRuleValidatorImpl registerNewCityNameRuleValidatorImpl,
			RegisterNewCityStateRuleValidatorImpl registerNewCityStateRuleValidatorImpl) {
		this.registerNewCityIdRuleValidatorImpl = registerNewCityIdRuleValidatorImpl;
		this.registerNewCityNameRuleValidatorImpl = registerNewCityNameRuleValidatorImpl;
		this.registerNewCityStateRuleValidatorImpl = registerNewCityStateRuleValidatorImpl;
	}
	
	@Override
	public void validate(CityDomain data) {
		registerNewCityIdRuleValidatorImpl.validate(data);
		registerNewCityNameRuleValidatorImpl.validate(data);
		registerNewCityStateRuleValidatorImpl.validate(data.getId());
		
	}

}
