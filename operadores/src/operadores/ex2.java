package operadores;
import java.util.Scanner;


public class ex2 {

	public static void main(String[] args) {
		
		float [] nota = new float[4]; //cria array/vetor
		float soma = 0;
		int i;
		
		Scanner leia = new Scanner(System.in);
		
		for (i=0; i<4; i++) {
			System.out.printf("Nota %d: ", i+1);
			nota[i] = leia.nextFloat();
			soma += nota[i];
		}
		
		
		System.out.printf("Média final: %.1f", soma/4);
		
		leia.close();
		
	}

}
