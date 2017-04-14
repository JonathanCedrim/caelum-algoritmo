package fila;

import java.util.LinkedList;
import java.util.Queue;

import lista.Aluno;

public class ApiQueue {
	
	public static void main(String[] args) {
		Queue<Aluno> fila = new LinkedList<Aluno>();
		
		Aluno aluno1 = new Aluno("Jonathan");
		Aluno aluno2 = new Aluno("Adriano");
		Aluno aluno3 = new Aluno("Maycom");
		
		fila.offer(aluno1);
		fila.offer(aluno2);
		fila.offer(aluno3);
		
		Aluno alunoRemovido1 = fila.poll();
		Aluno alunoRemovido2 = fila.poll();
		Aluno alunoRemovido3 = fila.poll();		
		
		if(fila.isEmpty()){
			System.out.println(fila.toString());			
			System.out.println("Aluno removidos do inicio: " + alunoRemovido1 + ", " + alunoRemovido2 + ", "+ alunoRemovido3);			
		}else{
			System.out.println("fila vazia");
		}					
	}
}