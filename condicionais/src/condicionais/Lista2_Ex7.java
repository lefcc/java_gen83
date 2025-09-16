package condicionais;
import java.util.Scanner;

public class Lista2_Ex7 {

	public static void main(String[] args) {
		int cod;
		float num1, num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		num1 = input.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		num2 = input.nextFloat();
		
		input.close();
		
		System.out.println("Operação: ");
		cod = input.nextInt();
		
		switch(cod) {
		
		case 1:
			System.out.printf("%.1f + %.1f = %.1f", num1, num2, num1+num2);
			break;
			
		case 2:
			System.out.printf("%.1f - %.1f = %.1f", num1, num2, num1-num2);
			break;
			
		case 3:
			System.out.printf("%.1f * %.1f = %.1f", num1, num2, num1*num2);
			break;
			
		case 4:
			System.out.printf("%.1f / %.1f = %.1f", num1, num2, num1/num2);
			break;
			
		default:
			System.out.printf("Opção inválida!");
			break;
			
		}
		

	}

}
