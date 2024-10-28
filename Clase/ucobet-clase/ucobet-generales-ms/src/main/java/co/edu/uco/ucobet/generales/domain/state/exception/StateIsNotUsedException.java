package co.edu.uco.ucobet.generales.domain.state.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class StateIsNotUsedException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public StateIsNotUsedException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final StateIsNotUsedException create() {
        return new StateIsNotUsedException(
            "El estado no está en uso y puede ser eliminado.",
            "Technical message here",
            new Exception()
        );
    }
}
