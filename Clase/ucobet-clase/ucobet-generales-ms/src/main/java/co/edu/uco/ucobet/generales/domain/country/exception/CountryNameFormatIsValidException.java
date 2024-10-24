package co.edu.uco.ucobet.generales.domain.country.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CountryNameFormatIsValidException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CountryNameFormatIsValidException(final String userMessage, final String technicalMessage,Exception rootException) {
        super(userMessage, technicalMessage,rootException);
    }

    public static final CountryNameFormatIsValidException create() {
        return new CountryNameFormatIsValidException("El formato del nombre del país no es válido.", "Technical message here",new Exception());
    }
}
