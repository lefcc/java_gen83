package condicionais;
import java.util.Scanner;

public class Lista1_Ex1 {

	public static void main(String[] args) {
		int numA, numB, numC;
		int soma = 0;
		

		Scanner input = new Scanner(System.in);
		
			System.out.printf("Digite o valor A: ");
			numA = input.nextInt();
			
			System.out.printf("Digite o valor B: ");
			numB = input.nextInt();
			
			System.out.printf("Digite o valor C: ");
			numC = input.nextInt();
		
		
		input.close();
		
		soma = numA + numB;
		
		System.out.printf("%n%d + %d = %d", numA, numB, soma);
		if (soma > numC) {
			System.out.printf(" > %d%n%n", numC);
			System.out.printf("A Soma de A + B é Maior do que C.");
		}
		if (soma < numC) {
			System.out.printf(" < %d%n", numC);
			System.out.printf("A Soma de A + B é Menor do que C.");
		}
		if (soma == numC) {
			System.out.printf(" = %d%n", numC);
			System.out.printf("A Soma de A + B é Igual a C.");
		}
		
		
	}

}
