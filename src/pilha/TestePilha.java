package pilha;

public class TestePilha {
	public static void main(String[] args) {

		Pilha<Peca> pilha = new Pilha<Peca>();
		Peca lampada = new Peca("lampada");
		Peca capa = new Peca("capa");
		Peca suporte = new Peca("suporte");

		pilha.insere(lampada);
		pilha.insere(capa);
		pilha.insere(suporte);
		
		Peca pecaRemove = pilha.remove();
		
		if (pilha.vazia()) {
			System.out.println("A pilha está vazia");
		}
		
		System.out.println(pilha.toString());
		
		
		Pilha<String> pilha2 = new Pilha<String>();

		pilha2.insere("Adalberto");
		pilha2.insere("Maria");

		String maria = pilha2.remove();
		String adalberto = pilha2.remove();

		System.out.println(maria);
		System.out.println(adalberto);
	}

}