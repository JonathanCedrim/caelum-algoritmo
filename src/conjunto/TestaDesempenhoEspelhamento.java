package conjunto;

public class TestaDesempenhoEspelhamento {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		for(int i = 0; i < 500000; i++){
			conjunto.adiciona("palavra" + i);
		}
		
		for(int i = 0; i < 500000; i++){
			conjunto.contem("palavra" + i);
		}
		
		//System.out.println(conjunto.toString());
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio) / 1000.0);
	}
}
