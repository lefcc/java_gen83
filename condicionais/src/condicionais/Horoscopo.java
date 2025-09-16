package condicionais;

import java.util.Scanner;

public class Horoscopo {

	public static void main(String[] args) {
		int signo;

		Scanner leia = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("        Horóscopo do dia        ");
		System.out.println("================================");
		System.out.println("                                ");
		System.out.println("       1 - Capricórnio          ");
		System.out.println("       2 - Aquário              ");
		System.out.println("       3 - Peixes               ");
		System.out.println("       4 - Áries                ");
		System.out.println("       5 - Touro                ");
		System.out.println("       6 - Gêmeos               ");
		System.out.println("       7 - Câncer               ");
		System.out.println("       8 - Leão                 ");
		System.out.println("       9 - Virgem               ");
		System.out.println("       10 - Libra               ");
		System.out.println("       11 - Escorpião           ");
		System.out.println("       12 - Sagitário           ");
		System.out.println("================================");
		System.out.println("Digite a opção desejada:        ");
		signo = leia.nextInt();

		switch (signo) {

		case 1:
			System.out
					.println("Capricórnio: Dia favorável ao planejamento a longo prazo — seja persistente e paciente.");
			break;

		case 2:
			System.out.println(
					"Aquário: Ideias inovadoras surgem; compartilhe suas visões com pessoas que apoiam seu propósito.");
			break;

		case 3:
			System.out.println(
					"Peixes: Sensibilidade e empatia são seus trunfos; cultive a criatividade e cuide da saúde emocional.");
			break;

		case 4:
			System.out.println(
					"Áries: Hoje é dia de tomar a iniciativa — comece aquele projeto pendente com coragem e foco.");
			break;

		case 5:
			System.out.println(
					"Touro: Priorize seu bem-estar: desacelere, cuide do corpo e evite decisões financeiras impulsivas.");
			break;

		case 6:
			System.out
					.println("Gêmeos: Comunicações fluem bem — lute por clareza em conversas importantes e ouça mais.");
			break;

		case 7:
			System.out.println(
					"Câncer: Conexões afetivas pedem atenção; demonstre carinho e estabeleça limites saudáveis.");
			break;

		case 8:
			System.out
					.println("Leão: Sua confiança atrai oportunidades; brilhe, mas mantenha a humildade nas relações.");
			break;

		case 9:
			System.out.println(
					"Virgem: Organização traz resultados — revise seus detalhes antes de entregar algo importante.");
			break;

		case 10:
			System.out.println(
					"Libra: Busque equilíbrio entre dar e receber; negociações têm mais chance de sucesso hoje.");
			break;

		case 11:
			System.out.println(
					"Escorpião: Intuição em alta — confie nos seus instintos, especialmente em assuntos íntimos.");
			break;

		case 12:
			System.out.println(
					"Sagitário: Aventure-se com responsabilidade; novos conhecimentos podem expandir seus horizontes.");
			break;
		default:
			System.out.println("Opção inválida!");

		}
		leia.close();

	}

}
