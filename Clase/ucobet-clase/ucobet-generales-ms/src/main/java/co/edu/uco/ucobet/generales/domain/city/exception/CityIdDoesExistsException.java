package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;
import co.edu.uco.ucobet.generales.domain.country.exception.CountryIdDoesExistsException;

public final class CityIdDoesExistsException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CityIdDoesExistsException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final CountryIdDoesExistsException create() {
        return new CountryIdDoesExistsException("Ya existe un país con el id indicado.", "Technical message here", new Exception());
    }
}
