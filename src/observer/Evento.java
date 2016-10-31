package observer;

public class Evento<E> {

	public static final String PROFICIENTE = "PROFICIENTE";
	public static final String INSUFICIENTE = "INSUFICIENTE";
	
	private String nomeEvento;
	private E sujeito;
	
	
	public Evento(String nomeEvento, E sujeito){
		this.nomeEvento = nomeEvento;
		this.sujeito = sujeito;
	}
	
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public E getSujeito() {
		return sujeito;
	}
	public void setSujeito(E sujeito) {
		this.sujeito = sujeito;
	}
	
	
	
	
}
