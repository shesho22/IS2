package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityIdIsNotNullException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CityIdIsNotNullException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final CityIdIsNotNullException create() {
        return new CityIdIsNotNullException("El ID de la ciudad no debe ser nulo.","Technical message here", new Exception());
    }
}
