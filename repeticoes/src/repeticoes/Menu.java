package repeticoes;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		int opcao = 1;
		
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite a opção desejada: ");
			opcao = input.nextInt();
		
		} while (opcao != 0);		
		
		 input.close();
		
	}

}
