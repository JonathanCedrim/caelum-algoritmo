package Associativo;

import java.util.HashMap;

public class APIHashMap {
	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		
		HashMap<String, Carro> mapa = new HashMap<String, Carro>();
		for(int i = 0; i < 500; i++){
			mapa.put("abc1234" + i , new Carro("a"+i));
		}
		System.out.println(mapa);
		
		mapa.put("abc1234", new Carro("b"));
		
		System.out.println(mapa);
		
		mapa.put("def1234", new Carro("c"));
		
		
		System.out.println(mapa);		
		System.out.println(mapa.containsKey("abc1234"));		
		System.out.println(mapa.get("abc1234"));		
		mapa.remove("abc1234");		
		System.out.println(mapa);
		
		long termino = System.currentTimeMillis();
		
		System.out.println((termino - inicio) / 1000.0);
	}
}