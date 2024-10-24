package co.edu.uco.ucobet.generales.domain.country.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CountryIsNotUsedException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CountryIsNotUsedException(final String userMessage, final String technicalMessage,Exception rootException) {
        super(userMessage,technicalMessage,rootException);
    }

    public static final CountryIsNotUsedException create() {
        return new CountryIsNotUsedException("El país no está en uso y puede ser eliminado.", "Technical message here",new Exception());
    }
}
