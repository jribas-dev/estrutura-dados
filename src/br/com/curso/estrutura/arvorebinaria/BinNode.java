package br.com.curso.estrutura.arvorebinaria;

public class BinNode<T extends Comparable<T>> {
	private T conteudo;
	private BinNode<T> noEsq;
	private BinNode<T> noDir;

	public BinNode() {
	}

	public BinNode(T conteudo) {
		this.conteudo = conteudo;
		noEsq = noDir = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public BinNode<T> getNoEsq() {
		return noEsq;
	}

	public void setNoEsq(BinNode<T> noEsq) {
		this.noEsq = noEsq;
	}

	public BinNode<T> getNoDir() {
		return noDir;
	}

	public void setNoDir(BinNode<T> noDir) {
		this.noDir = noDir;
	}

	@Override
	public String toString() {
		return "BinNode{" + "conteudo=" + conteudo + '}';
	}
}
