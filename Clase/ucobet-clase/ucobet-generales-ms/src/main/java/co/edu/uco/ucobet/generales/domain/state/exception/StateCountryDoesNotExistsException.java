package co.edu.uco.ucobet.generales.domain.state.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class StateCountryDoesNotExistsException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public StateCountryDoesNotExistsException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage,technicalMessage,rootException);
    }

    public static final StateCountryDoesNotExistsException create() {
        return new StateCountryDoesNotExistsException("El país asociado al estado no existe.", "Technical message here", new Exception());
    }
}
