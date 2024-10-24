package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CityNameLengthIsValidException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CityNameLengthIsValidException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final CityNameLengthIsValidException create() {
        return new CityNameLengthIsValidException("La longitud del nombre de la ciudad no es válida.","Technical message here", new Exception());
    }
}
