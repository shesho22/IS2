package co.edu.uco.ucobet.generales.crosscutting.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.enums.Layer;

public class RuleUcobetException extends UcobetException{
	private static final long serialVersionUID=1L;
	
	public RuleUcobetException(final String userMessage,final String technicalMessage,final Exception rootException) {
		super(userMessage, technicalMessage, rootException, Layer.RULE);
	}
	
	public RuleUcobetException create(final String userMessage,final String technicalMessage,final Exception rootException) {
		return new RuleUcobetException(userMessage, technicalMessage, rootException);
	}
	
	public RuleUcobetException create(final String userMessage) {
		return new RuleUcobetException(userMessage, userMessage, new Exception());
	}
	
	public RuleUcobetException create(final String userMessage,final String technicalMessage) {
		return new RuleUcobetException(userMessage, technicalMessage, new Exception());
	}

}
