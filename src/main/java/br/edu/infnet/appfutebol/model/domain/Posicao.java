package br.edu.infnet.appfutebol.model.domain;

import java.util.List;

public abstract class Posicao {

	private List<Jogador> jogadores;

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
}