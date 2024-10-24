package co.edu.uco.ucobet.generales.domain.country.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class CountryIdDoesNotExistsException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CountryIdDoesNotExistsException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final CountryIdDoesNotExistsException create() {
        return new CountryIdDoesNotExistsException("No existe el país con el id indicado.", "Technical message here", new Exception());
    }
}
