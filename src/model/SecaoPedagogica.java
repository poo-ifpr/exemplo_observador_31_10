package model;

import observer.Evento;
import observer.Observer;

public class SecaoPedagogica implements Observer<Aluno> {
	private String nome;

	public SecaoPedagogica(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void oferecerAjuda() {
		System.out.println("Precisa de ajuda?");
		
	}
	
	public void update(Evento<Aluno> evento){
		if(Evento.INSUFICIENTE.equals(evento.getNomeEvento())){
			oferecerAjuda();
		}
	}
}
