package br.com.curso.estrutura.generics;

public class Main {

	public static void main(String[] args) {
		UsoGenerics<String> meuString = new UsoGenerics<String>("Texto 1");
		System.out.println(meuString);
		
		UsoGenerics<Integer> meuInteger = new UsoGenerics<Integer>(43);
		System.out.println(meuInteger);
	}

}
