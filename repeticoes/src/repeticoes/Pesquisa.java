package repeticoes;
import java.util.Scanner;


public class Pesquisa {

	public static void main(String[] args) {
		int idade, esporte, futebol = 0, voleiM18 = 0, basquetem18 = 0, totalRespostas=0;
		long somaIdade=0;
		double mediaIdades;
		String continua = "S";
		
		Scanner scan = new Scanner(System.in);
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Pesquisa - Esporte Favorito");
			
			System.out.println("Digite a sua idade: ");
			idade = scan.nextInt();
			
			somaIdade += idade;
			
			totalRespostas++;
			
			
			System.out.println("1 - Futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquetebol");
			
			System.out.println("Digite o seu Esporte Favorito");
			esporte = scan.nextInt();
			
			//total pessoas gostam de futebol
			if (esporte == 1) futebol++;
			
			// total pessoas gootam de volei e são >= 18 anos
			if (esporte == 2 && idade >= 18) voleiM18++;
			
			// total pessoas gootam de volei e são < 18 anos
			if (esporte == 3 && idade < 18) basquetem18++;
			
			
			
			System.out.println("Deseja continuar (S/N)?");
			scan.skip("\\R");
			continua = scan.nextLine().toUpperCase();
			
			
		}
		
		mediaIdades = Math.round(somaIdade / totalRespostas);
		System.out.printf("Total de pessoas que gostam de futebol: %d%n", futebol);
		System.out.printf("Total de pessoas que gostam de voleibol maiores de 18 anos: %d%n", voleiM18);
		System.out.printf("Total de pessoas que gostam de basquetebol menores de 18 anos: %d%n", basquetem18);
		System.out.printf("Média das idades: %.2f%n", mediaIdades);		
		
		scan.close();
		

	}

}
