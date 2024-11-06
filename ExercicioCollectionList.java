package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioCollectionList {

	public static void main(String[] args) {

//	Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
//	O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las
//	individualmente no ArrayList. Em seguida, faça o que se pede:
//	- Mostre na tela todas as cores que foram adicionadas. 
//	- Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.

		Scanner ler = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<>(); // Cria um novo arraylist
		System.out.println("Digite 5 cores: ");

		for (int i = 0; i < 5; i++) { // Loop para pedir as 5 cores ao usuário e salvá-las na variável cores
			cores.add(ler.nextLine());
		}

		System.out.println("Cores adicionadas: ");
		for (int i = 0; i < cores.size(); i++) { // Loop para imprimir os valores do array
			System.out.println(cores.get(i));
		}

		Collections.sort(cores); // Ordena o array
		System.out.println("\nCores adicionadas (em ordem crescente): ");
		for (int i = 0; i < cores.size(); i++) { // Loop para imprimir os valores em ordem crescente
			System.out.println(cores.get(i));
		}

		ler.close();
	}
}