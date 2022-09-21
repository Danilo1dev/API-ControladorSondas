package br.com.elo7.contraladorsondas.sonda.application.repository;

import java.util.List;
import java.util.UUID;
import br.com.elo7.contraladorsondas.sonda.domain.Sonda;

public interface SondaRepository {
	Sonda salva(Sonda sonda);
    List<Sonda> buscaTodasSondas();
    Sonda buscaSondaAtravesId(UUID idSonda);
    void deletaSondaAtravesId(Sonda sonda);
}
