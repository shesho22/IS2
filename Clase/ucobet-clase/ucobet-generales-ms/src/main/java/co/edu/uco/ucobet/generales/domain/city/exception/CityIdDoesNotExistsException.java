package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityIdDoesNotExistsException extends RuleUcobetException{
	
	private static final long serialVersionUID=1L;
	
	public CityIdDoesNotExistsException(final String userMessage, final String technicalMessage, Exception rootException) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final CityIdDoesNotExistsException create() {
		return new CityIdDoesNotExistsException( "No existe la ciudad con el id indicado...","Technical message here", new Exception());
	}

	
	
}
