package co.edu.uco.ucobet.generales.domain.country.exception;


import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CountryNameIsNotNullException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CountryNameIsNotNullException(final String userMessage, final String technicalMessage,Exception rootExecutable) {
        super(userMessage,technicalMessage,rootExecutable);
    }

    public static final CountryNameIsNotNullException create() {
        return new CountryNameIsNotNullException("El nombre del país no puede ser nulo.", "Technical message here",new Exception());
    }
}
