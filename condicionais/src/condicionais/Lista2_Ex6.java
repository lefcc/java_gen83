package condicionais;
import java.util.Scanner;

public class Lista2_Ex6 {

	public static void main(String[] args) {
		String colab;
		int cod;
		float salario;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Nome do colaborador: ");
		colab = input.nextLine();
		
		System.out.printf("%n");
		
		System.out.printf("Cargo: ");
		cod = input.nextInt();
		
		System.out.printf("%n");
		
		System.out.printf("Salário: ");
		salario = input.nextFloat();
			
		System.out.printf("%n");
		
		
		input.close();
		
		System.out.println("Nome: " + colab);
		
		switch(cod) {
		
		case 1:
			System.out.println("Gerente");
			System.out.printf("Salário: R$ %.2f", salario*1.1);
			break;
			
		case 2:
			System.out.println("Vendedor");
			System.out.printf("Salário: R$ %.2f", salario*1.07);
			break;
			
		case 3:
			System.out.println("Supervisor");
			System.out.printf("Salário: R$ %.2f", salario*1.09);
			break;
			
		case 4:
			System.out.println("Motorista");
			System.out.printf("Salário: R$ %.2f", salario*1.06);
			break;
			
		case 5:
			System.out.println("Estoquista");
			System.out.printf("Salário: R$ %.2f", salario*1.05);
			break;
			
		case 6:
			System.out.println("Técnico de TI");
			System.out.printf("Salário: R$ %.2f", salario*1.08);
			break;
			
		default:
			System.out.println("Opção inválida!");
			break;
		
		}
	

	}

}
