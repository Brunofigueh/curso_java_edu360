import java.util.HashMap;

public class HashMapExemplo {
	
	public static void main(String [] args) {
		
		HashMap<String, String> dicionario = new HashMap<>();
		
		dicionario.put("Palavra1", "Significado palavra 1");
		dicionario.put("Palavra2", "Significado palavra 2");
		dicionario.put("Palavra3", "Significado palavra 3");
		dicionario.put("Palavra4", "Significado palavra 4");
		
		//System.out.println(dicionario.get("Palavra3"));	
		
		HashMap<String, Integer> estoque = new HashMap<>();
		
		estoque.put("Maça", 10);
		estoque.put("Uva", 30);
		estoque.put("Melão", 20);
		
		//System.out.println(estoque.get("Maça"));
		
		for( String keys: estoque.keySet())
		{
			System.out.println(keys+" - "+ estoque.get(keys));
		}
	}
}
