package repeticoes;
import java.util.Scanner;

public class Lista3_Ex5_NumInt {
	
	public static void main(String[] args) {
		int num, pos=0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.printf("Digite um número: ");
			num = scan.nextInt();

			if (num > 0) pos += num;
			
			
		} while (!(num == 0));
		
		System.out.printf("A soma dos números positivos é: %d", pos);
		scan.close();
	}

}
