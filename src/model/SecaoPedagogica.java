package model;

public class SecaoPedagogica {
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
}
