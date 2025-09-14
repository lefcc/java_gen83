package operadores;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		float salario, abono;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		
		
		System.out.printf("Novo Salário: %.2f", salario + abono);
		
		
		leia.close();

	}

}
