package repeticoes;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int numero, i=1;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.printf("Digite um número inteiro: ");
		numero = input.nextInt();
		
		while (i<11) {
			System.out.printf("%d x %d = %d%n", numero, i, numero*i);
			
			i++;
		}
		
		input.close();

	}

}
