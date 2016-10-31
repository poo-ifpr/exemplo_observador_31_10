package model;

import observer.Evento;
import observer.Observer;

public class Patrocinador implements Observer<Aluno> {
	
	private String nome;

	public Patrocinador(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void concederBolsa(Aluno aluno) {
		System.out.println(aluno.getNome() + "ganhou bolsa");
		aluno.setBolsa(true);
		
	}

	public void removerBolsa(Aluno aluno) {
		aluno.setBolsa(false);
		
	}
	
	public void update(Evento<Aluno> evento){
		if(Evento.INSUFICIENTE.equals(evento.getNomeEvento())){
			removerBolsa(evento.getSujeito());
		}
		else if(Evento.PROFICIENTE.equals(evento.getNomeEvento())){
			concederBolsa(evento.getSujeito());
		}
	}
}
