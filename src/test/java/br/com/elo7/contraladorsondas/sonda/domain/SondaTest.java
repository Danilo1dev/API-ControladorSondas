package br.com.elo7.contraladorsondas.sonda.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import br.com.elo7.contraladorsondas.planeta.application.api.pouso.PousoSondaPlanetaRequest;
import lombok.extern.log4j.Log4j2;

@Log4j2
class SondaTest {

	@Test
	void deveraExeceutarComandosQuandoForUmaStringDeComandosValidosTeste1() {
		Sonda sonda = Sonda.builder()
		.nome("SONDA 1")
		.build();
		PousoSondaPlanetaRequest pousoSonda1 = PousoSondaPlanetaRequest.builder()
				.posicaoSonda(PosicaoSonda.builder()
						.posicaoX(1)
						.posicaoY(2)
						.direcao(DirecaoSonda.NORTE)
						.build())
				.build();
		
		sonda.pousa(UUID.randomUUID(), pousoSonda1);
		
		sonda.recebeComando("LMLMLMLMM");
		
		PosicaoSonda posicaoFinal = PosicaoSonda.builder()
				.posicaoX(1)
				.posicaoY(3)
				.direcao(DirecaoSonda.NORTE)
				.build();
		
		log.info("deveraExeceutarComandosQuandoForUmaStringDeComandosValidosTeste1");
		log.info(sonda.getPosicao());
		log.info(posicaoFinal);
		assertEquals(posicaoFinal, sonda.getPosicao());
	}
}
