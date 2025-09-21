package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Cores {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			// cria o objeto collection ArrayList, aqui é do tipo String
			ArrayList<String> cores = new ArrayList<String>();
			
			
			for (int i=0; i<5; i++) {
			System.out.println("\nDigite uma cor: ");
			String cor = scan.nextLine();
			cores.add(cor);
			}
			
			
			System.out.println("\nCores inseridas: ");
			System.out.println(cores);
			
			System.out.println("\nCores ordenadas: ");
			cores.sort(null);
			
			//Collections.sort(cores); por meio deste comando também ordenamos em ordem crescente
			System.out.println(cores);
		
			scan.close();
		}

	}
	

}
