package lista;

public class Array {

	private int max = 100;
	private Aluno[] alunos = new Aluno[max];
	private int contador = 0;

	void adiciona(Aluno aluno) {

		if (contador < max) {
			this.alunos[contador] = aluno;
			contador++;
		} else {
			aumentaEspaco();
		}
	}

	void adiciona(int posicao, Aluno aluno) {
		if (posicao <= contador) {
			this.alunos[posicao] = aluno;
		} else {
			System.out.println("nao e possivel adicionar!");
		}
	}

	void remove(int posicao) { // contador vai ate 99, verificar
		if (posicao < contador) {
			for (int i = posicao; i < contador; i++) {
				this.alunos[i] = this.alunos[i + 1];
			}
			contador--;
		} else {
			System.out.println("valor invalido para remocao");
		}
	}

	Aluno buscaPorNome(String nome) {
		for (int i = 0; i < contador; i++) {
			if (alunos[i].getNome().equals(nome)) {
				return alunos[i];
			}
		}
		return null;
	}

	Aluno buscaPorPosicao(int posicao) {
		if (posicao >= 0 && posicao < contador) {
			return alunos[posicao];
		}
		throw new IllegalArgumentException("posicao invalida");
	}

	int lenght() {
		return this.contador;
	}

	private void aumentaEspaco() {
		Aluno[] aux = new Aluno[max * 2];

		for (int i = 0; i < max; i++) {
			aux[i] = this.alunos[i];
		}

		this.alunos = aux;
		this.max = max * 2;
	}

	public String toString() {
		if (contador == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();

		builder.append("[");

		for (int i = 0; i < contador - 1; i++) {
			builder.append(alunos[i].getNome());
			builder.append(", ");
		}
		builder.append(alunos[contador - 1]);
		builder.append("]");

		return builder.toString();
	}
}
