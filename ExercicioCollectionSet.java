package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollectionSet {

	public static void main(String[] args) {

//	Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. 
//	O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não 
//	repetidos e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
//	Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 

		Set<Integer> numeros = new HashSet<>(); // Cria um conjunto (set) para armazenar números inteiros únicos

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite 10 números inteiros (não repetidos): ");

		int i = 1; // Contador para exibir o número da posição que o usuário deve inserir

		while (numeros.size() < 10) { // Continua o loop enquanto o set/conjunto não tiver 10 números únicos
			System.out.print("Digite o " + i + "º numero: ");

			while (!ler.hasNextInt()) { // Verifica se o valor inserido é um número inteiro
				System.out.println("Por favor, digite apenas números inteiros.");
				ler.next(); // Descarta a entrada inválida para que o usuário possa tentar novamente
			}

			int numero = ler.nextInt(); // Lê o número inteiro fornecido pelo usuário

			if (numeros.contains(numero)) { // Verifica se o número já está no set/conjunto

				System.out.println("Número já inserido. Insira um número diferente.");

			} else {
				numeros.add(numero); // Adiciona o número ao set/conjunto se ele não for repetido
				i++; // Incrementa o contador apenas quando um número válido é adicionado
			}
		}

		System.out.println("Números inseridos organizados em ordem crescente: ");

		Iterator<Integer> iterator = numeros.iterator(); // Percorre os elementos do set/conjunto

		while (iterator.hasNext()) { // Itera sobre cada elemento do set/conjunto

			System.out.println(iterator.next()); // Exibe o próximo número do set/conjunto
		}

		ler.close();
	}

}
