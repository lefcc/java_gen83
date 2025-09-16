package condicionais;
import java.util.Scanner;

public class Lista1_Ex2 {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		num = input.nextInt();
		
		System.out.printf("%n");
		
		if ((num%2==0) && (num > 0)) System.out.printf("O Número %d é par e positivo!", num);
		else if ((num%2==0) && (num < 0)) System.out.printf("O Número %d é par e negativo!", num);
		else if ((num%2==0) && (num > 1)) System.out.printf("O Número %d é ímpar e positivo!", num);
		else System.out.printf("O Número %d é ímpar e negativo!", num);
		
		input.close();
	}

}
