package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityNameIsNotEmptyException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CityNameIsNotEmptyException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final CityNameIsNotEmptyException create() {
        return new CityNameIsNotEmptyException("El nombre de la ciudad no debe estar vacío.","Technical message here", new Exception());
    }
}
