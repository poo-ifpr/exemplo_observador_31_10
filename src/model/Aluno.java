package model;

import observer.Evento;
import observer.SujeitoBasico;

public class Aluno extends SujeitoBasico<Aluno> {

	private String nome;
	private String nota;
	private boolean bolsa;
	private Responsavel responsavel;
	private SecaoPedagogica secaoPedagogica;
	private Patrocinador patrocinador;
	
	
	public Aluno(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
		if("D".equals(nota)){
			notificar(Evento.INSUFICIENTE);
		}
		else if("A".equals(nota)){
			notificar(Evento.PROFICIENTE);
		}
	}
	public boolean isBolsa() {
		return bolsa;
	}
	public void setBolsa(boolean bolsa) {
		this.bolsa = bolsa;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public SecaoPedagogica getSecaoPedagogica() {
		return secaoPedagogica;
	}

	public void setSecaoPedagogica(SecaoPedagogica secaoPedagogica) {
		this.secaoPedagogica = secaoPedagogica;
	}

	public Patrocinador getPatrocinador() {
		return patrocinador;
	}

	public void setPatrocinador(Patrocinador patrocinador) {
		this.patrocinador = patrocinador;
	}

}
