import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		
		//Collections.sort(palavras, comparador);
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
			}
		);
		/*
		 * palavras.sort(new Comparator<String>() {
		 * 
		 * @Override public int compare(String s1, String s2) { if(s1.length() <
		 * s2.length()) return -1; if(s1.length() > s2.length()) return 1; return 0; }
		 * });
		 */
		
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);
		
		/* palavras.sort((s1, s2) -> s1.length() - s2.length()) */;
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String ::length));
		
		Function<String, Integer> funcao = String ::length;
		Function<String, Integer> funcao2 = s -> s.length();
		
		/*
		 * Function<String, Integer> funcao = s -> s.length();
		 *  Comparator<String> comparador = Comparator.comparing(s -> s.length(funcao));
		 * palavras.sort(comparador);
		 */
		
		
		//for (String p : palavras) {
			//System.out.println(p);
		//}
		
		Consumer<String> impressor = s -> System.out.println(s);
		Consumer<String> impressor2 = System.out::println;
		palavras.forEach(impressor);
		
		palavras.forEach(s -> System.out.println(s));
		palavras.forEach( System.out::println);
		/*
		 * palavras.forEach(new Consumer<String>(){ public void accept(String palavra) {
		 * System.out.println(palavra); } });
		 */

	}

}


	

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length()< s2.length())
			return -1;
		if(s1.length()> s2.length())
			return 1;
		return 0;
	}
	
	
}