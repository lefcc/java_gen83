package operadores;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		float [] numero = new float[4];
		int i;
		
		Scanner input = new Scanner(System.in);
		
		
		for (i=0; i<4; i++) {
		System.out.printf("numero%d: ", i+1);
		numero[i] = input.nextFloat();
		input.close();	
		}
		
		System.out.printf("Diferença: %.1f", (numero[0] * numero[1]) - (numero[2] * numero[3]));
		
		
	}

}
