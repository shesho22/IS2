package co.edu.uco.ucobet.generales.application.primaryports.interactor;

public interface InterectorWithReturn <T,R>{
	
	R execute(T data);

}
