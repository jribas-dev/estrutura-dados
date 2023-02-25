package br.com.curso.estrutura.listaduplaencadeada;

public class Main {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

		minhaListaEncadeada.add("c00");
		minhaListaEncadeada.add("c01");
		minhaListaEncadeada.add("c02");
		minhaListaEncadeada.add("c03");
		minhaListaEncadeada.add("c04");
		System.out.println(minhaListaEncadeada);

		minhaListaEncadeada.remove(2);
		System.out.println("\n"+minhaListaEncadeada);

		minhaListaEncadeada.add(2, "cXX");
		System.out.println("\n"+minhaListaEncadeada);
		System.out.println("\n"+minhaListaEncadeada.getNo(2));
	}

}
