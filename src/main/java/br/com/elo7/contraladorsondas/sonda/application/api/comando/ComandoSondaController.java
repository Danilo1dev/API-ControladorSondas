package br.com.elo7.contraladorsondas.sonda.application.api.comando;

import java.util.UUID;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ComandoSondaController implements ComandoSondaAPI{
	
	@Override
	public void postComandoSonda(UUID idSonda, @Valid ComandoSondaRequest comandoRequest) {
	log.info("[inicia] ComandoSondaController - postComandoSonda");
	log.info("[finaliza] PousoSondaPlanetaController - postPousoSondaPlaneta");
	}
}
