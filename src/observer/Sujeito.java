package observer;

public interface Sujeito<E> {

	public void adicionarObservador(Observer<E> observador);
	public void removerObservador(Observer<E> observador);
	public void notificar(String nomeEvento);
	
	
}
