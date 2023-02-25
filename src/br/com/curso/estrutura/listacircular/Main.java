package br.com.curso.estrutura.listacircular;

public class Main {

	public static void main(String[] args) {
		ListaCircular<String> minhaListaCircular = new ListaCircular<>();

		minhaListaCircular.add("c0");
		minhaListaCircular.add("c1");
		minhaListaCircular.add("c2");
		minhaListaCircular.add("c3");
		System.out.println(minhaListaCircular);

		minhaListaCircular.remove(0);
		System.out.println("\n" + minhaListaCircular);
		System.out.println(minhaListaCircular.getNo(7));
		System.out.println(minhaListaCircular.getNo(10));

		minhaListaCircular.remove(1);
		System.out.println("\n" + minhaListaCircular);
		System.out.println(minhaListaCircular.getNo(7));
		System.out.println(minhaListaCircular.getNo(10));
	}

}
