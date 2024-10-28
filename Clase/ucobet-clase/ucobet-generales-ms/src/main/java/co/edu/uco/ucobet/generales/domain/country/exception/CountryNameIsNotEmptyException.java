package co.edu.uco.ucobet.generales.domain.country.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CountryNameIsNotEmptyException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CountryNameIsNotEmptyException(final String userMessage, final String technicalMessage,Exception rootException) {
        super(userMessage, technicalMessage,rootException);
    }

    public static final CountryNameIsNotEmptyException create() {
        return new CountryNameIsNotEmptyException("El nombre del país no puede estar vacío.", "Technical message here",new Exception());
    }
}
