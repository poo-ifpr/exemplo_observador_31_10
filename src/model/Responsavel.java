package model;

public class Responsavel {

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
	
	
}
