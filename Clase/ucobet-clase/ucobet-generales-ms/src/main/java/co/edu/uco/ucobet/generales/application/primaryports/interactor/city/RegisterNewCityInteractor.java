package co.edu.uco.ucobet.generales.application.primaryports.interactor.city;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.generales.application.primaryports.interactor.InteractorWhitoutReturn;
import jakarta.transaction.Transactional;

@Service
@Transactional
public interface RegisterNewCityInteractor extends InteractorWhitoutReturn<RegisterNewCityDTO>{
	

}
