package observer;

import java.util.ArrayList;
import java.util.List;


public abstract class SujeitoBasico<E> implements Sujeito<E> {

	private List<Observer<E>> observadores;

	
	public SujeitoBasico(){
		super();
		observadores = new ArrayList<Observer<E>>();
	
	}

	public void adicionarObservador(Observer<E> observador){
		observadores.add(observador);
	}
	
	public void removerObservador(Observer<E> observador){
		observadores.remove(observador);
	}
	
	public void notificar(String nomeEvento){
		for (Observer<E> observador : observadores) {
			observador.update(new Evento(nomeEvento, (E) this));
		}
	}
	
}
