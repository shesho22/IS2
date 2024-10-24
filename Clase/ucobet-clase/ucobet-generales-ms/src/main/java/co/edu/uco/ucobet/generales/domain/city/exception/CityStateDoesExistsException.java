package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityStateDoesExistsException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CityStateDoesExistsException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final CityStateDoesExistsException create() {
        return new CityStateDoesExistsException("La ciudad ya está asociada con un estado existente.","Technical message here", new Exception());
    }
}
