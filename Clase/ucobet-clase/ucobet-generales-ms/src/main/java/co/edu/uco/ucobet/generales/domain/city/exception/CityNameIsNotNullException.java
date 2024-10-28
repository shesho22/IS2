package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityNameIsNotNullException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CityNameIsNotNullException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final CityNameIsNotNullException create() {
        return new CityNameIsNotNullException("El nombre de la ciudad no debe ser nulo.","Technical message here", new Exception());
    }
}
