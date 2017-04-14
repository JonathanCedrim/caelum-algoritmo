package lista;

/**
 * @author cedrim
 * 
 */
public class Aluno {

	private String nome;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return this.nome;
	}

	public boolean equals(Object obj) {
		return this.equals((Aluno) obj);
	}
}