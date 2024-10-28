package co.edu.uco.ucobet.generales.domain.state.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class StateNameLengthIsValidException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public StateNameLengthIsValidException(final String userMessage, final String technicalMessage,Exception rootException) {
        super(userMessage, technicalMessage,rootException);
    }

    public static final StateNameLengthIsValidException create() {
        return new StateNameLengthIsValidException("El nombre del estado debe tener una longitud válida.", "Technical message here",new Exception());
    }
}
