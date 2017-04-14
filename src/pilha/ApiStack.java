package pilha;

import java.util.Stack;

public class ApiStack {
	public static void main(String[] args) {
		
		Stack pilha = new Stack();
		
		Peca lampada = new Peca("lampada");
		Peca capa = new Peca("capa");
		Peca suporte = new Peca("suporte");
		
		pilha.push(lampada);
		pilha.push(capa);
		pilha.push(suporte);
		
		
		Peca peca = (Peca) pilha.pop();
		
		if(!pilha.isEmpty()){
			System.out.println("pilha vazia");
		}		
	}
}
