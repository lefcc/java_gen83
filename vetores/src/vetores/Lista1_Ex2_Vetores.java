package vetores;

import java.util.Scanner;

public class Lista1_Ex2_Vetores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int i, num;
		boolean encontrou = false;
		
		System.out.printf("Digite o número que você deseja encontrar: ");
		num = scan.nextInt();
		
		for (i=0; i<10; i++) {
			if (num == vetor[i]) {
				System.out.printf("O número %d está localizado na posição: %d", num, i);
				encontrou = true;
				break;
			}	
		}
		
		// (encontrou == false) = (!encontrou) forma simplificada mas diz a mesma coisa
		if (encontrou == false)  {
			System.out.printf("O número %d não foi encontrado!", num);
		}
		
		
		scan.close();
		
	}

}
