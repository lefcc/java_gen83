package vetores;

import java.util.Scanner;

public class ExMatrix {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int num[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		
		
		float numReais[][] = new float[3][2];
		
		System.out.println("Lista os dados - Matriz Números");
		
		for(int l=0; l<num.length; l++) {
			for(int c=0; c<num.length; c++) {
				System.out.printf("num[%d][%d] = %d%n", l, c, num[l][c]);
			}
		}
		
		System.out.println("\n\nInput dos dados - Matriz Números Reais");
		
		for(int l=0; l<numReais.length; l++) {
			for(int c=0; c<numReais[l].length; c++) {
				System.out.printf("Digite um número ");
				numReais[l][c] = leia.nextFloat();
			}
		}
		
		
		System.out.println("\n\nListar os dados - Matriz Números Reais");
		for(int l=0; l<numReais.length; l++) {
			for(int c=0; c<numReais[l].length; c++) {
				System.out.printf("numReais[%d][%d] = %.2f%n", l, c, numReais[l][c]);
			}
		}
		
		leia.close();
	}

}
