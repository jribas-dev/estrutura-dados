package br.com.curso.estrutura.pilha;

public class Main {

	public static void main(String[] args) {
		Pilha minhaPilha = new Pilha();
		minhaPilha.push(new No(10));
		minhaPilha.push(new No(20));
		minhaPilha.push(new No(30));
		minhaPilha.push(new No(40));
		minhaPilha.push(new No(50));
		minhaPilha.push(new No(60));

		System.out.println(minhaPilha);

		System.out.println(minhaPilha.pop());

		System.out.println(minhaPilha);

		minhaPilha.push(new No(-10));
		System.out.println(minhaPilha);
	}

}
