package model;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class Aluno {

	private String nome;
	private String nota;
	private boolean bolsa;
	private Responsavel responsavel;
	private SecaoPedagogica secaoPedagogica;
	private Patrocinador patrocinador;
	private List<Observer<Aluno>> observadores;
	
	
	public Aluno(String nome){
		this.nome = nome;
		observadores = new ArrayList<Observer<Aluno>>();
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
			notificar("INSUFICIENTE");
		}
		else if("A".equals(nota)){
			notificar("PROFICIENTE");
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
	
	public void adicionarObservador(Observer<Aluno> observador){
		observadores.add(observador);
	}
	
	public void removerObservador(Observer<Aluno> observador){
		observadores.remove(observador);
	}
	
	public void notificar(String nomeEvento){
		for (Observer<Aluno> observador : observadores) {
			observador.update(nomeEvento, this);
		}
	}
	
	
}
