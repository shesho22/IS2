package co.edu.uco.ucobet.generales.application.usecase.city;

import co.edu.uco.ucobet.generales.application.usecase.RuleValidator;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;

public interface RegisterNewCityIdRulesValidator extends RuleValidator<CityDomain>{

	void validate(CityDomain data);

}
