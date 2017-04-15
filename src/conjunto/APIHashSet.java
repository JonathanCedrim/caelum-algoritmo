package conjunto;

import java.util.HashSet;

public class APIHashSet {
	public static void main(String[] args) {
		HashSet<String> conjunto = new HashSet<String>();

		long inicio = System.currentTimeMillis();

		for (int i = 0; i < 50000000; i++) {
			conjunto.add("Maycom");
			conjunto.add("Adriano");
			conjunto.add("Rafael");
			conjunto.add("Jonathan");
			conjunto.add("Rafael");
			conjunto.add("Ana");
			conjunto.add("Paulo");
		}

		System.out.println(conjunto);

		long termino = System.currentTimeMillis();

		System.out.println((termino - inicio) / 1000.0);
	}
}
