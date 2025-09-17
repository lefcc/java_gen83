package vetores;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;



public class ExVetor {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = {"Cintia", "Stella", "Patrícia", "Rafaela", "Letícia", "Jamila", "Priscila"};
		
		System.out.println("\nListagem - Vetor de nomes");
		
		Arrays.sort(nomes, Collections.reverseOrder());  /*com este collections.reverseorder os nomes dentro do array inverteram de posição
		inclusive a posição dentro do array(vetor). Quando imprimimos reverno com base no i-- ele só imprime reverso, 
		A posição dentro do array permanece a mesma */
		 
		
		for(int i=0; i<nomes.length; i++) {
			System.out.printf("nomes[%d] = %s%n", i, nomes[i]);
		}
		
		System.out.println("\nInput de dados - Vetor de Numeros");
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("\nInsira um número: ");
			numeros[i] = leia.nextInt();
		}
		
		System.out.println("\nListagem - Vetor de Numeros");
		
		for(int i=0; i<numeros.length; i++) {
			System.out.printf("nomes[%d] = %s%n", i, numeros[i]);
		}
		
		leia.close();
	}

}
