package co.edu.uco.ucobet.generales.domain.country.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CountryNameLengthIsValidException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CountryNameLengthIsValidException(final String userMessage, final String technicalMessage,Exception rootException) {
        super(userMessage, technicalMessage,rootException);
    }

    public static final CountryNameLengthIsValidException create() {
        return new CountryNameLengthIsValidException("El nombre del país debe tener una longitud válida.", "Technical message here", new Exception());
    }
}
