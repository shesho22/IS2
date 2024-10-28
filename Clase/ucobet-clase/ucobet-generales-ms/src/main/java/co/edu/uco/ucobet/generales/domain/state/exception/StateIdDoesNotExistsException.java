package co.edu.uco.ucobet.generales.domain.state.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class StateIdDoesNotExistsException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public StateIdDoesNotExistsException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final StateIdDoesNotExistsException create() {
        return new StateIdDoesNotExistsException("No existe el estado con el id indicado.", "Technical message here", new Exception());
    }
}
