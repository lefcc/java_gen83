package collection;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(1);
		
		System.out.println(numeros);
		
		System.out.println("Exibir o elemento na posição 2: " + numeros.get(2));
		System.out.println("Exibir a posição do elemento 10: " + numeros.indexOf(10));
		
		//trocando o numero 10 por 4
		
		numeros.set(numeros.indexOf(10), 4);
		System.out.println(numeros);
		
		

	}

}
