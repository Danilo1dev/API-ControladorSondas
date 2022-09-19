package br.com.elo7.contraladorsondas.sonda.domain;

import lombok.Value;

@Value
public class PosicaoSonda {
	private Integer posicaoX;
	private Integer posicaoY;
	private DirecaoSonda direcao;
}
