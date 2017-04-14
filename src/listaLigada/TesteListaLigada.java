package listaLigada;

public class TesteListaLigada {

	public static void main(String[] args) {

		ListaLigada listaLigada = new ListaLigada();

		listaLigada.adiciona("Rafael");
		listaLigada.adiciona("Paulo");
/*
		 lista.adiciona(0, "Paulo");
		 lista.adiciona(1, "Camila");

		 System.out.println(lista);
		 System.out.println(lista.pega(0));
		 System.out.println(lista.pega(1));
		 lista.remove(1);
		 lista.removeDoComeco();
		 lista.removeDoFim();
*/
		System.out.println(listaLigada.toString());
	}
}
