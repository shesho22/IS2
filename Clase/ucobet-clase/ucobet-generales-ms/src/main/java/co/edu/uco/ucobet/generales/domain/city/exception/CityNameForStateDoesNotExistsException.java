package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityNameForStateDoesNotExistsException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CityNameForStateDoesNotExistsException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final CityNameForStateDoesNotExistsException create() {
        return new CityNameForStateDoesNotExistsException("No existe una ciudad con el nombre indicado para el estado.","Technical message here", new Exception());
    }
}
