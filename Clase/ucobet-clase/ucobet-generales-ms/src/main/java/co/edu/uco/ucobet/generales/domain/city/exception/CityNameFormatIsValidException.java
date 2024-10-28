package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityNameFormatIsValidException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CityNameFormatIsValidException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final CityNameFormatIsValidException create() {
        return new CityNameFormatIsValidException("El formato del nombre de la ciudad no es válido.","Technical message here", new Exception());
    }
}
