package br.com.elo7.contraladorsondas.planeta.application.api.pouso;

import java.util.UUID;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class PousoSondaPlanetaController implements PousoSondaPlanetaAPI {
	
	@Override
	public void postPousoSondaPlaneta(UUID idPlaneta, @Valid PousoSondaPlanetaRequest pousoRequest) {
		log.info("[inicia] PousoSondaPlanetaController - postPousoSondaPlaneta");
		log.info("[finaliza] PousoSondaPlanetaController - postPousoSondaPlaneta");
	}
}
