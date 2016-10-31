package main;

import model.Aluno;
import model.Patrocinador;
import model.Responsavel;
import model.SecaoPedagogica;

public class Main {

	public static void main(String[] args) {
		
		Responsavel mae_joao = new Responsavel("Mãe João");
		Responsavel tia_maria = new Responsavel("Tia Maria");
		Patrocinador jorge_o_magnata = new Patrocinador("Jorge");
		SecaoPedagogica gertrudes = new SecaoPedagogica("Gertrudes");
		
		
		
		
		Aluno joao = new Aluno("João");
		
		joao.setPatrocinador(jorge_o_magnata);
		joao.setResponsavel(mae_joao);
		joao.setSecaoPedagogica(gertrudes);
		joao.setNota("D");
		
		Aluno maria = new Aluno("Maria");
		maria.setPatrocinador(jorge_o_magnata);
		maria.setResponsavel(tia_maria);
		maria.setSecaoPedagogica(gertrudes);
		maria.setNota("A");
		
	}
	
	
	
}
