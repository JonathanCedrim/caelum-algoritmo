package conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento<T> {

	private List<List<T>> tabela = new ArrayList<List<T>>();
	private int tamanho = 0;

	public ConjuntoEspalhamento() {
		for (int i = 0; i < 26; i++) {
			LinkedList<T> lista = new LinkedList<T>();
			tabela.add(lista);
		}
	}

	public void adiciona(T objeto) {
		if (!this.contem(objeto)) {
			verificaCarga();
			int indice = this.calculaIndiceDaTabela(objeto);
			List<T> lista = this.tabela.get(indice);
			lista.add(objeto);
			this.tamanho++;
		}
	}

	public void remove(T objeto) {
		if (this.contem(objeto)) {
			verificaCarga();
			int indice = this.calculaIndiceDaTabela(objeto);
			List<T> lista = this.tabela.get(indice);
			lista.remove(objeto);
			this.tamanho--;

		}
	}

	public boolean contem(T objeto) {
		int indice = this.calculaIndiceDaTabela(objeto);
		List<T> lista = this.tabela.get(indice);

		return lista.contains(objeto);
	}

	public List<T> pegaTodas() {
		List<T> objeto = new ArrayList<T>();

		for (int i = 0; i < tabela.size(); i++) {
			objeto.addAll(this.tabela.get(i));
		}
		return objeto;
	}

	private int calculaIndiceDaTabela(T objeto) {
		int codigoDeEspelhamento = objeto.hashCode();
		codigoDeEspelhamento = Math.abs(codigoDeEspelhamento);
		return codigoDeEspelhamento % this.tabela.size();
	}

	// so para string
	/*
	 * private int calculaCodigoDeEspelhamento(String palavra) { int codigo = 1;
	 * 
	 * for (int i = 0; i < palavra.length(); i++) { codigo = 31 * codigo +
	 * palavra.charAt(i); } return codigo; }
	 */
	private void redimensionaTabela(int novaCapacidade) {
		List<T> objetos = this.pegaTodas();
		this.tabela.clear();

		for (int i = 0; i < novaCapacidade; i++) {
			this.tabela.add(new LinkedList<T>());
		}

		for (T objeto : objetos) {
			this.adiciona(objeto);
		}
	}

	private void verificaCarga() {
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho / capacidade;

		if (carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		} else if (carga < 0.25) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder build = new StringBuilder("[");

		for (List<T> lista : this.tabela) {
			build.append(lista + ", ");
		}
		build.append("]");
		return build.toString();
	}
}