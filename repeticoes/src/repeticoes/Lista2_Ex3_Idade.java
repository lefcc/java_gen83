package repeticoes;
import java.util.Scanner;

public class Lista2_Ex3_Idade {

	public static void main(String[] args) {
		int idade, menor21 = 0, maior50 = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade = scan.nextInt();
		
		while (idade >= 0) {
			
			if (idade < 21) menor21++;
			if (idade > 50) maior50++;
			
			System.out.println("Digite uma idade: ");
			idade = scan.nextInt();
				
		} 
		
		
		scan.close();
		System.out.printf("Total de pessoas menores de 21 anos: %d", menor21);
		System.out.printf("%nTotal de pessoas maiores de 50 anos: %d", maior50);
		
	}

}
