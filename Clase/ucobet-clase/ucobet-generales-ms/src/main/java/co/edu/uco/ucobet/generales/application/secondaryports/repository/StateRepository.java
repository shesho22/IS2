package co.edu.uco.ucobet.generales.application.secondaryports.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uco.ucobet.generales.application.secondaryports.entity.StateEntity;


public interface StateRepository extends JpaRepository<StateEntity, UUID>{

}
