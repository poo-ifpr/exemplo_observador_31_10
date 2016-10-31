package observer;

public interface Observer<E> {

	public void update(String nomeEvento, E elemento);
	
}
