package co.edu.uco.ucobet.generales.domain.state.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class StateIdDoesExistsException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public StateIdDoesExistsException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final StateIdDoesExistsException create() {
        return new StateIdDoesExistsException("Ya existe un estado con el id indicado.", "Technical message here", new Exception());
    }
}
