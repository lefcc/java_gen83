package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet_10ValoresInt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int valor;
		
		Set<Integer> valores = new HashSet<Integer>();
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite um valor inteiro (não repetido): ");
			valor = scan.nextInt(); //lê número digitado como variável valor
			
			if (!valores.add(valor)) {
			System.out.println("Valor já existe. Insira outro valor. ");
			i--;
			} else {
				valores.add(valor);
			}
			
			
		} 
		
		System.out.println("%nNúmeros inseridos: ");
		
		Iterator<Integer> ivalores = valores.iterator();
		
		while (ivalores.hasNext()) {
			System.out.println(ivalores.next());
		}
		
		scan.close();
	}
		
	

}


