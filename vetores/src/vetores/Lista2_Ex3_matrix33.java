package vetores;

import java.util.Scanner;

public class Lista2_Ex3_matrix33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int l, c, i, somaPrincipal=0, somaSecundaria=0;
		
		
		for (l=0; l<matriz.length; l++) {
			for (c=0; c<matriz[l].length; c++) {
				System.out.printf("Insira o número na posição[%d][%d]: ", l, c);
				matriz[l][c] = scan.nextInt();
			}
		}
		
		System.out.println("\nElementos da Diagonal Principal: ");
		for (i = 0; i < matriz.length; i++) {
		    System.out.printf(matriz[i][i] + " ");
		    somaPrincipal += matriz[i][i];
		}

		System.out.println("\nElementos da Diagonal Secundária: ");
		for (i = 0; i < matriz.length; i++) {
		    System.out.printf(matriz[i][matriz.length - 1 - i] + " ");
		    somaSecundaria += matriz[i][matriz.length - 1 - i];
		}
		
		
		System.out.println("\n\nA Soma dos Elementos da Diagonal Principal:\n" + somaPrincipal);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária:\n" + somaSecundaria);
		
		scan.close();
	}

}
