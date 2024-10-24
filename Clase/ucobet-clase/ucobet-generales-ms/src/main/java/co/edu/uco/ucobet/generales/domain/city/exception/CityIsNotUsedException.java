package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityIsNotUsedException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CityIsNotUsedException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final CityIsNotUsedException create() {
        return new CityIsNotUsedException("La ciudad no está en uso y no se puede realizar esta acción.","Technical message here", new Exception());
    }
}
