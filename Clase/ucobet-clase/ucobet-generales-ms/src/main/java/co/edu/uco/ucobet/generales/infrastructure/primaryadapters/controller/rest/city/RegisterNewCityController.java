package co.edu.uco.ucobet.generales.infrastructure.primaryadapters.controller.rest.city;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.ucobet.generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.generales.application.usecase.city.impl.RegisterNewCityImpl;

@RestController
@RequestMapping("/general/api/v1/cities")
public class RegisterNewCityController {
	
	private RegisterNewCityInteractor registerNewCityInteractor;
	//private RegisterNewCityImpl registerNewCityImpl; (el interactor debe llamar el caso de uso. el error es porque el caso se uso no se esta llamado y por eso su eliminacion soluciona el error)
	
	
	
	public RegisterNewCityController(final RegisterNewCityInteractor registerNewCityInteractor) {
		this.registerNewCityInteractor = registerNewCityInteractor;
	}


    @GetMapping("/welcome")
    public String home() {
        return "Welcome to Ucobet!";
    }

	@PostMapping
	public RegisterNewCityDTO execute(@RequestBody RegisterNewCityDTO dto) {
		registerNewCityInteractor.execute(dto);
		return dto; 
		
	}

}
