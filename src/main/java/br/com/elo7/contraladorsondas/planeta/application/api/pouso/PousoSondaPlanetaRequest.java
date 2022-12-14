package br.com.elo7.contraladorsondas.planeta.application.api.pouso;

import java.util.UUID;
import br.com.elo7.contraladorsondas.sonda.domain.PosicaoSonda;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PousoSondaPlanetaRequest {
	private UUID idSonda;
	private PosicaoSonda posicaoSonda;
}
