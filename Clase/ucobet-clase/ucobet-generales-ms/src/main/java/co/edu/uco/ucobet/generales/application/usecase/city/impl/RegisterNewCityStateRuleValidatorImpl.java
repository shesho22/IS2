package co.edu.uco.ucobet.generales.application.usecase.city.impl;

import java.util.UUID;


import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityStateRulesValidator;


import co.edu.uco.ucobet.generales.domain.state.rules.StateDoesExistsRule;
import co.edu.uco.ucobet.generales.domain.state.rules.StateIdIsNotDefaultValueRule;
import co.edu.uco.ucobet.generales.domain.state.rules.SteteIdIsNotNullRule;


public final class RegisterNewCityStateRuleValidatorImpl implements RegisterNewCityStateRulesValidator{


	private StateDoesExistsRule stateDoesExistsRule;
	private SteteIdIsNotNullRule steteIdIsNotNullRule;
	private StateIdIsNotDefaultValueRule stateIdIsNotDefaultValueRule;
	
	
	
	public RegisterNewCityStateRuleValidatorImpl(final StateDoesExistsRule stateDoesExistsRule,
			final SteteIdIsNotNullRule steteIdIsNotNullRule, final StateIdIsNotDefaultValueRule stateIdIsNotDefaultValueRule) {
		this.stateDoesExistsRule = stateDoesExistsRule;
		this.steteIdIsNotNullRule = steteIdIsNotNullRule;
		this.stateIdIsNotDefaultValueRule = stateIdIsNotDefaultValueRule;
	}



	@Override
	public void validate(final UUID stateId) {
		steteIdIsNotNullRule.validate(stateId);
		stateIdIsNotDefaultValueRule.validate(stateId);
		stateDoesExistsRule.validate(stateId);
		
	}


	

}
