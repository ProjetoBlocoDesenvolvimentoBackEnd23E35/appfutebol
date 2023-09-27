package br.edu.infnet.appfutebol.model.domain;

import java.util.List;

public class Clube {

	private String nome;
	private String cidade;
	private List<Jogador> jogadores;

	public void imprimir() {

		System.out.println(this);		
		
		System.out.println("Listagem de jogadores do clube " + nome + ": ");
		
		for(Jogador j : jogadores) {
			System.out.println(j.getNome());
		}
	}
	
	@Override
	public String toString() {

		return String.format("O clube %s, localizado na cidade de %s tem %d jogadores", 
				nome,
				cidade,
				jogadores.size()
			);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
}