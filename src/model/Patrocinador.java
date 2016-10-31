package model;

public class Patrocinador {
	
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
}
