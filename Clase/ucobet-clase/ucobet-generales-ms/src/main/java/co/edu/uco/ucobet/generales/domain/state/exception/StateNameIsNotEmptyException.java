package co.edu.uco.ucobet.generales.domain.state.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class StateNameIsNotEmptyException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public StateNameIsNotEmptyException(final String userMessage, final String technicalMessage,Exception rootException) {
        super(userMessage, technicalMessage,rootException);
    }

    public static final StateNameIsNotEmptyException create() {
        return new StateNameIsNotEmptyException("El nombre del estado no puede estar vacío.", "Technical message here",new Exception());
    }
}
