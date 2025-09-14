package operadores;
import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		
		// Instanciar um novo objeto da Classe Scanner (Entrada de dados)
		
		Scanner leia = new Scanner(System.in);
		
		// Definir variáveis
		
		double num1, num2;
		
		// Entrada de dados
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextDouble();
		
		//  Efetuar os Cálculos
		
		System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1+num2);
		System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1-num2);
		System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1*num2);
		System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1/num2);

		System.out.printf("%.2f ^ %.2f = %.2f\n", num1, num2, Math.pow(num1, num2));
		System.out.printf("Raiz Quadrada de %.2f = %.2f\n", num1, Math.sqrt(num1));
		
		
		leia.close();
	}
	
}
