package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityIdDoesExistsException extends RuleUcobetException{
	
	private static final long serialVersionUID=1L;
	
	public CityIdDoesExistsException(String userMessage, String technicalMessage, Exception rootException) {
		super(userMessage, technicalMessage, rootException);
		// TODO Auto-generated constructor stub
	}

	
}
