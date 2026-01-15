package ArraysList;

import java.util.ArrayList;

public class ExercicioArrayList {
	public static void main(String[] args) {
		String[] nomes = { "Paola", "Marcos", "Pedro", "Maria", "Beatriz" };
		ArrayList<String> nomes2 = new ArrayList<>();
		
		for (String nome : nomes) {
			System.out.println("Nome no array: " + nome);
		}

		for (String adicionarLista : nomes) {
			nomes2.add(adicionarLista);

		}

		for (String nomeLista : nomes2) {
			System.out.println("Nome transferidos para lista: " + nomeLista);
		}

	}

}
