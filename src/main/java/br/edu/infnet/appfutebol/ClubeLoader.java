package br.edu.infnet.appfutebol;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfutebol.model.domain.Clube;
import br.edu.infnet.appfutebol.model.domain.Jogador;

@Order(2)
@Component
public class ClubeLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Jogador j1 = new Jogador();
		j1.setIdade(20);
		j1.setNome("Joao");
		
		Jogador j2 = new Jogador();
		j2.setIdade(30);
		j2.setNome("Maria");
		
		Jogador j3 = new Jogador();
		j3.setIdade(40);
		j3.setNome("Ana");
		
		List<Jogador> listagemJogadores = new ArrayList<Jogador>();
		listagemJogadores.add(j1);
		listagemJogadores.add(j2);
		listagemJogadores.add(j3);
		
		Clube clube = new Clube();
		clube.setCidade("Rio de Janeiro");
		clube.setNome("Infnet FC");
		clube.setJogadores(listagemJogadores);

		clube.imprimir();
	}
}