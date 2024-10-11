package co.edu.uco.ucobet.generales.application.secondaryports.mapper.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uco.ucobet.generales.application.secondaryports.entity.CityEntity;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, UUID>{

	
}
