package helloworld;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		int peso = leia.nextInt();
		
		System.out.println("Digite uma opção: ");		
		char opcao = leia.next().charAt(0);
		
		System.out.println("Digite um valor: ");
		float valor = leia.nextFloat();
		
		System.out.printf("O valor da variável peso é: %d\n", peso); //printf não tem atalho
		
		System.out.println("O valor da variável opção é: " + opcao); 
		
		System.out.printf("O valor da variável valor é: %.2f", valor);
		
		leia.close();

	}

	
}
