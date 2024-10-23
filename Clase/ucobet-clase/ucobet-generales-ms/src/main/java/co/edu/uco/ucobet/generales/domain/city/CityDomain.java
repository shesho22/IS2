package co.edu.uco.ucobet.generales.domain.city;

import java.util.UUID;

import co.edu.uco.ucobet.generales.domain.Domain;
import co.edu.uco.ucobet.generales.domain.state.StateDomain;

public final class CityDomain extends Domain{

	private String name;
	private StateDomain state;
	
	
	public CityDomain(final UUID id,final String name,final StateDomain country) {
		super(id);
		setName(name);
		setState(state);
	}


	public final String getName() {
		return name;
	}


	private final void setName(final String name) {
		this.name = name;
	}


	public final StateDomain getState() {
		return state;
	}


	private final void setState(final StateDomain state) {
		this.state = state;
	}
	

}
