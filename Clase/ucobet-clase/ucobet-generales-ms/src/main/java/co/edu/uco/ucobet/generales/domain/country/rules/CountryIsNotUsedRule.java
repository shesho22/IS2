package co.edu.uco.ucobet.generales.domain.country.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.generales.domain.DomainRule;
@Service
public interface CountryIsNotUsedRule extends DomainRule<UUID>{

}
