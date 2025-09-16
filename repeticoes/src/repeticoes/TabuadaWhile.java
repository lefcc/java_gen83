package repeticoes;
import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		int numero;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.printf("Digite um número inteiro: ");
		numero = input.nextInt();
		
		for (int i=1; i<11; i++) {
			System.out.printf("%d x %d = %d%n", numero, i, numero*i);
			
		}
		
		input.close();

	}

}
