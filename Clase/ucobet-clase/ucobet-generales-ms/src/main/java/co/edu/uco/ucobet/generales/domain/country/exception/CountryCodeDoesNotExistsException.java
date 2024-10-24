package co.edu.uco.ucobet.generales.domain.country.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CountryCodeDoesNotExistsException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CountryCodeDoesNotExistsException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final CountryCodeDoesNotExistsException create() {
        return new CountryCodeDoesNotExistsException(
            "El código del país no existe.",
            "Technical message here",
            new Exception()
        );
    }
}
