package model;

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
	
	public void update(String nomeEvento, Aluno aluno){
		if("INSUFICIENTE".equals(nomeEvento)){
			oferecerAjuda();
		}
	}
}
