package br.com.curso.estrutura.generics;

// Unknown Wildcard			=> <>
// UpperBounded Wildcard	=> <? extends Pessoa>
// LowerBounded Wildcard	=> <? super Pessoa>

// K para Key: 		Map<K,V>
// V para Value:	Map<K,V>
// E para Element:	List<E>
// T para Type:		Collections#addAll
// ? quando generico

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
