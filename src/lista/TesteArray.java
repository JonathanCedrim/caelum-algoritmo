package lista;

import java.beans.VetoableChangeListener;
import java.util.Collection;
import java.util.Vector;

public class TesteArray {
	public static void main(String[] args) {

		Array alunos = new Array();

		Aluno aluno0 = new Aluno("Jonathan");
		Aluno aluno1 = new Aluno("Adriano");
		Aluno aluno2 = new Aluno("Roger");
		Aluno aluno3 = new Aluno("Lucas");
		Aluno especial = new Aluno("Especial");

		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		alunos.adiciona(aluno2);
		alunos.adiciona(aluno3);
		alunos.adiciona(0, especial);

		//alunos.remove(1);

		
		System.out.println("buscando por posicao: " + alunos.buscaPorPosicao(1));

		Aluno x = alunos.buscaPorNome("Jonathan");
		if (x != null) {
			System.out.println("Buscando por nome: " + x.getNome());
		}
		for (int i = 0; i < alunos.lenght(); i++) {
			System.out.println(alunos.buscaPorPosicao(i));

		}

		System.out.println(alunos.lenght());

		System.out.println(alunos.toString());
		
		Vector<Aluno> vector = new Vector<Aluno>();
		
		vector.add(aluno0);
		
		for(int i = 0; i < 1000; i++){		
			vector.add(aluno1);						
		}
		Vector<Aluno> c = new Vector<Aluno>();
		c.addAll(vector);
		
		System.out.println(vector.size());
		System.out.println(c.size());
		
		
	}
}
