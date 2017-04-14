package pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {

	private List<T> pecas = new LinkedList<T>();

	public void insere(T peca) {
		this.pecas.add(peca);
	}

	public T remove() {
		return this.pecas.remove(this.pecas.size() - 1);
	}

	public boolean vazia() {
		return this.pecas.isEmpty();
	}
}
