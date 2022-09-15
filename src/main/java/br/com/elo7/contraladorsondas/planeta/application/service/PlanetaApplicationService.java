package br.com.elo7.contraladorsondas.planeta.application.service;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import br.com.elo7.contraladorsondas.planeta.application.api.PlanetaDetalhadoResponse;
import br.com.elo7.contraladorsondas.planeta.application.api.PlanetaListResponse;
import br.com.elo7.contraladorsondas.planeta.application.api.PlanetaResponse;
import br.com.elo7.contraladorsondas.planeta.application.api.planetaRequest;
import br.com.elo7.contraladorsondas.planeta.application.repository.PlanetaRepository;
import br.com.elo7.contraladorsondas.planeta.domain.Planeta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PlanetaApplicationService implements PlanetaService{
	private final PlanetaRepository planetaRepository;

	@Override
	public PlanetaResponse criaPlaneta(planetaRequest planetaRequest) {
		log.info("[inicia] PlanetaApplicationService - criaPlaneta");
		Planeta planeta = planetaRepository.salva(new Planeta(planetaRequest));
		log.info("[finaliza] PlanetaApplicationService - criaPlaneta");
		return PlanetaResponse.builder()
				.idPlaneta(planeta.getIdPlaneta())
				.build();
	}

	@Override
	public List<PlanetaListResponse> buscaTodosPlanetas() {
		log.info("[inicia] PlanetaApplicationService - buscaTodosPlanetas");
		List<Planeta> planeta = planetaRepository.buscaTodosPlanetas();
		log.info("[finaliza] PlanetaApplicationService - buscaTodosPlanetas");
		return PlanetaListResponse.converte(planeta);
	}

	@Override
	public PlanetaDetalhadoResponse buscaClienteAtravesID(UUID idPlaneta) {
		log.info("[inicia] PlanetaApplicationService - buscaClienteAtravesID");
		log.info("[finaliza] PlanetaApplicationService - buscaClienteAtravesID");
		return null;
	}
}
