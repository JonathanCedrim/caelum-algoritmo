package conjunto;

import java.util.List;

public class TestaAdicionar {
	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();

		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");

		List<Object> objetos = conjunto.pegaTodas();

		for (Object objeto : objetos) {
			System.out.println(objeto);
		}
	}
}
