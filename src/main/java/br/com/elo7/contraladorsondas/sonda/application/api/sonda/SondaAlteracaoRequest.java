package br.com.elo7.contraladorsondas.sonda.application.api.sonda;

import javax.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class SondaAlteracaoRequest {
	 @NotBlank
	 private String nome;
}
