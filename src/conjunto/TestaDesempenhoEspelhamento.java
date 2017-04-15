package conjunto;

public class TestaDesempenhoEspelhamento {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		for(int i = 0; i < 5000; i++){
			conjunto.adiciona("palavra");
		}
		
	
		
		//System.out.println(conjunto.toString());
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio) / 1000.0);
	}
}
