package model;

import observer.Evento;
import observer.Observer;

public class Responsavel implements Observer<Aluno> {

	private String nome;

	public Responsavel(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void darSermao() {
		System.out.println("Estude mais, filho(a)");
	}
	
	public void update(Evento<Aluno> evento){
		if(Evento.INSUFICIENTE.equals(evento.getNomeEvento())){
			darSermao();

		}
	}
	
}
