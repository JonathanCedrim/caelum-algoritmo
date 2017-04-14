package listaLigada;

public class ListaLigada {

	private Celula primeira;
	private Celula ultima;
	private static int totalDeElementos;

	public void adicionaNoComeco(Object elemento) {
		if (this.totalDeElementos == 0) {
			Celula celula = new Celula(elemento);

			this.primeira = celula;
			this.ultima = celula;
		} else {
			Celula celula = new Celula(this.primeira, elemento);

			this.primeira.setAnterior(celula);
			this.primeira = celula;
		}
		this.totalDeElementos++;
	}

	public void adiciona(Object elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula celula = new Celula(elemento);

			this.ultima.setProxima(celula);
			celula.setAnterior(this.ultima);
			this.ultima = celula;
			this.totalDeElementos++;
		}
	}

	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0) {
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) {
			this.adiciona(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProxima();
			Celula celula = new Celula(anterior.getProxima(), elemento);

			celula.setAnterior(anterior);
			anterior.setProxima(celula);
			proxima.setProxima(celula);
			this.totalDeElementos++;
		}
	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		if (posicao == 0) {
			this.removeDoComeco();
		} else if (posicao == this.totalDeElementos - 1) {
			this.removeDoFim();
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula celula = anterior.getProxima();
			Celula proxima = celula.getProxima();

			anterior.setProxima(proxima);
			proxima.setAnterior(anterior);

			this.totalDeElementos--;
		}

	}

	public void removeDoComeco() {

	}

	public void removeDoFim() {
		if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProxima(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}

	public boolean contem(Object elemento) {
		Celula celula = this.primeira;

		while (celula != null) {
			if (celula.getElemento().equals(elemento)) {
				return true;
			}
			celula = celula.getProxima();
		}
		return false;
	}

	public int tamanho() {
		return this.totalDeElementos;
	}

	private Celula pegaCelula(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}

		Celula celula = this.primeira;
		for (int i = 0; i < posicao; i++) {
			celula = celula.getProxima();
		}
		return celula;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	@Override
	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");
		Celula celula = this.primeira;

		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(celula.getElemento());
			builder.append(", ");

			celula = celula.getProxima();
		}

		builder.append(celula.getElemento());
		builder.append("]");

		return builder.toString();

	}
}