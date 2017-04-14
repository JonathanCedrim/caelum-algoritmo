package conjunto;

public class TestaEspelhamento {
	public static void main(String[] args) {
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		for(int i = 0; i < 100; i++){
			conjunto.adiciona("" + i);
		}
		
		System.out.println(conjunto.toString());
	}
}