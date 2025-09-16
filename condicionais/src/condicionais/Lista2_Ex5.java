package condicionais;

import java.util.Scanner;


public class Lista2_Ex5 {

public static void main(String[] args) {
		int cod;
		float quantidd;
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.printf("Insira o código do produto: ");
		cod = input.nextInt();
		
		System.out.printf("%n");
		
		System.out.printf("Insira a quantidade: ");
		quantidd = input.nextInt();
		
		System.out.printf("%n%n");
		
		input.close();
		
		switch(cod) {
		
		case 1:
			System.out.println("Cachorro Quente");
			System.out.printf("%n");
			System.out.printf("Valor total: R$ %.2f", 10*quantidd);
			break;
			
		case 2:
			System.out.println("X-Salada");
			System.out.printf("%n");
			System.out.printf("Valor total: R$ %.2f", 15*quantidd);
			break;

		case 3:
			System.out.println("X-Bacon");
			System.out.printf("%n");
			System.out.printf("Valor total: R$ %.2f", 18*quantidd);
			break;

		case 4:
			System.out.println("Bauru");
			System.out.printf("%n");
			System.out.printf("Valor total: R$ %.2f", 12*quantidd);
			break;
			
		case 5:
			System.out.println("Refrigerante");
			System.out.printf("%n");
			System.out.printf("Valor total: R$ %.2f", 8*quantidd);
			break;
			
		case 6:
			System.out.println("Suco de laranja");
			System.out.printf("%n");
			System.out.printf("Valor total: R$ %.2f", 13*quantidd);
			break;			
		
		default:
			System.out.printf("Opção inválida!");
		
		}
	
		
	}
}
