package co.edu.uco.ucobet.generales.domain.state.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcobetException;

public final class StateNameFormatIsValidException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public StateNameFormatIsValidException(final String userMessage, final String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }

    public static final StateNameFormatIsValidException create() {
        return new StateNameFormatIsValidException(
            "El formato del nombre del estado no es válido.",
            "The format of the state name does not comply with the required standards.",
            new Exception()
        );
    }
}
