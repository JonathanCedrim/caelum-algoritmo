package fila;

import java.util.LinkedList;
import java.util.List;

import lista.Aluno;

public class Fila {
	
	private List<Aluno> fila = new LinkedList<Aluno>();
	
	public void insere(Aluno object){
		fila.add(object);
	}
	
	public Aluno remove(){
		return fila.remove(fila.size() - 1);				
	}
	
	public boolean vazia(){
		return fila.isEmpty();
	}
	
	@Override
	public String toString() {	
		return fila.toString();
	}
}