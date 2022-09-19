package br.com.elo7.contraladorsondas.planeta.application.service;

import java.util.UUID;
import javax.validation.Valid;
import org.springframework.stereotype.Service;
import br.com.elo7.contraladorsondas.planeta.application.api.pouso.PousoSondaPlanetaRequest;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PousoApplicationService implements PousoService {

	@Override
	public void pousa(UUID idPlaneta, @Valid PousoSondaPlanetaRequest pousoRequest) {
		log.info("[inicia] PousoApplicationService - pousa");		
		log.info("[finaliza] PousoApplicationService - pousa");		
	}
}
