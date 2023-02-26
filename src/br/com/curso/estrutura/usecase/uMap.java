package br.com.curso.estrutura.usecase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class uMap {

	public static void main(String[] args) {
		Map<String, String> aluno = new HashMap<>();
		aluno.put("Nome", "João");
		aluno.put("Idade", "17");
		aluno.put("Media", "8.5");
		aluno.put("Turma", "3a");

		System.out.println("HashMap:\n" + aluno);
		System.out.println("keySet:\n" + aluno.keySet());
		System.out.println("values:\n" + aluno.values());

		Map<String, String> aluno2 = new HashMap<>();
		aluno2.put("Nome", "Maria");
		aluno2.put("Idade", "18");
		aluno2.put("Media", "8.9");
		aluno2.put("Turma", "3b");

		List<Map<String, String>> listaAlunos = new ArrayList<>();
		listaAlunos.add(aluno);
		listaAlunos.add(aluno2);

		System.out.println("\nArrayList Map:\n" + listaAlunos);
		System.out.println("containsKey:\n" + aluno.containsKey("Nome"));
	}
}