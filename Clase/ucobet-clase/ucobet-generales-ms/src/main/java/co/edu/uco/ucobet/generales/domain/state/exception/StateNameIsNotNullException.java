package co.edu.uco.ucobet.generales.domain.state.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class StateNameIsNotNullException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public StateNameIsNotNullException(final String userMessage, final String technicalMessage,Exception rootException) {
        super(userMessage, technicalMessage,rootException);
    }

    public static final StateNameIsNotNullException create() {
        return new StateNameIsNotNullException("El nombre del estado no puede ser nulo.", "Technical message here",new Exception());
    }
}
