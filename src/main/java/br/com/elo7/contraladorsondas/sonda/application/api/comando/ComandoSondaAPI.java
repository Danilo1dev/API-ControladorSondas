package br.com.elo7.contraladorsondas.sonda.application.api.comando;

import java.util.UUID;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sonda")
public interface ComandoSondaAPI {
	@PostMapping(value = "/{idSonda}/comando")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void postComandoSonda(@PathVariable UUID idSonda,
			@Valid @RequestBody ComandoSondaRequest comandoRequest);
}	