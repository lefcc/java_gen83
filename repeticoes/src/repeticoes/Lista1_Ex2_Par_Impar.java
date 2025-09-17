package repeticoes;
import java.util.Scanner;

public class Lista1_Ex2_Par_Impar {

	public static void main(String[] args) {
		int par=0, impar=0;
		int[] num = new int[10];

		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			num[i] = scan.nextInt();

			if (num[i] % 2==0) par++; 
			else impar++; 
		}
		
		System.out.printf("Total de números pares: %d%n", par);
		System.out.printf("Total de números ímpares: %d", impar);
		scan.close();
	}

}
