package conjunto;

import java.util.List;

public class TestaRemove {
	public static void main(String[] args) {

		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();

		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");

		List<Object> objetos = conjunto.pegaTodas();

		System.out.println("antes de remover");

		for (Object objeto : objetos) {
			System.out.println(objeto);
		}

		conjunto.remove("Rafael");
		objetos = conjunto.pegaTodas();
		
		System.out.println("depois de remover");
		
		for (Object objeto : objetos) {
			System.out.println(objeto);
		}
	}
}
