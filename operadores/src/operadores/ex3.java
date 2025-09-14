package operadores;
import java.util.Scanner;


public class ex3 {

	public static void main(String[] args) {
		float salario = 0, adicional = 0, horaExtra = 0, descontos = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Salário Bruto: ");
		salario = input.nextFloat();
		
		System.out.printf("Adicional Noturno: ");
		adicional = input.nextFloat();
		
		System.out.printf("Horas Extras: ");
		horaExtra = input.nextFloat();
		
		System.out.printf("Descontos: ");
		descontos = input.nextFloat();
		
		System.out.printf("Salário Líquido: %.2f", salario + adicional + (horaExtra*5) - descontos);
		
		input.close();
		
	}

}
