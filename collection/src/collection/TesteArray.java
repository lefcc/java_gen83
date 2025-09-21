package collection;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArray {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<>();
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		
		
		// mostra na telas todas as notas inseridas
		System.out.println("\nNotas cadastradas: " + notas.toString());
		
		
		// mostra uma determinada nota existente na lista
		System.out.println("\nExiste nota 5 na lista? " + notas.contains(5d));
		
		
		//modifica valor salvo no indice (indice, valor a ser inserido)
		notas.set(1, 6.0d);
		System.out.println("\nNota 5, índice 1, foi alterada para 6: " + notas.toString());
		
		// remove nota do índice mencionado (indice)
		notas.remove(1);
		System.out.println("\nNota 6, índice 1, foi apagada: " + notas.toString());
		
		
		// checa se lista está vazia
		System.out.println("\nA lista está vazia? " + notas.isEmpty());
		
		// exibe o tamanho da lista (número de elementos)
		System.out.println("\nO tamanho da lista é: " + notas.size());
		
		//exibe o maior valor da lista
		System.out.println("\nA maior nota da lista é: " + Collections.max(notas));
		
		//exibe o menor valor da lista
		System.out.println("\nA maior nota da lista é: " + Collections.min(notas));

		//limpa a lista
		notas.clear();
		System.out.println("\nA lista está vazia? " + notas.isEmpty());
		
		
	}

}
