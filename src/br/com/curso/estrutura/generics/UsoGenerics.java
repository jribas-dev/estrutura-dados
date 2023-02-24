package br.com.curso.estrutura.generics;

public class UsoGenerics<T> {
	private T t;

	public UsoGenerics(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "UsoGenerics [t=" + t + "]";
	}

}
