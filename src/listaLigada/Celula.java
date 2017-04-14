package listaLigada;

public class Celula {

	private Celula proxima;
	private Celula anterior;
	private Object elemento;

	public Celula(Object elemento) {
		this.elemento = elemento;
	}

	public Celula(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}

	public Celula getProxima() {
		return proxima;
	}
	
	public void setProxima(Celula celula) {
		this.proxima = celula;
	}

	public Celula getAnterior(){
		return anterior;
	}
	
	public Celula setAnterior(Celula anterior){
		return this.anterior = anterior;
	}

	public Object getElemento() {
		return elemento;
	}

	
}
