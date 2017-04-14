package fila;

import lista.Aluno;

public class TesteFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		Aluno aluno1 = new Aluno("Jonathan");
		Aluno aluno2 = new Aluno("Adriano");
		Aluno aluno3 = new Aluno("Maycom");
		
		fila.insere(aluno1);
		fila.insere(aluno2);
		fila.insere(aluno3);
		
		Aluno alunoRemovido3 = fila.remove();
		Aluno alunoRemovido2 = fila.remove();
		Aluno alunoRemovido1 = fila.remove();

		if (fila.vazia()) {
			System.out.println("fila vazia");
		}else{
			System.out.println(fila.toString());
		}
		
		System.out.println("Alunos remodvidos por ordem: " + alunoRemovido3 +", "+ alunoRemovido2 +", "+ alunoRemovido1);
		
	}
}