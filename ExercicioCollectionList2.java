package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCollectionList2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		ArrayList <Integer> numeros = new ArrayList<>();

		System.out.println("Digite 10 números inteiros. ");

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro: ");
			while (!ler.hasNextInt()) {
				System.out.println("Por favor, digite apenas números: ");
				ler.next();
			}
			numeros.add(ler.nextInt());
		}
		System.out.println("Digite o número que deseja encontrar: ");
		while (!ler.hasNextInt()) {
			System.out.println("Por favor, digite apenas números: ");
			ler.next();
		}
		int numeroDigitado = ler.nextInt();
		int posicao = numeros.indexOf(numeroDigitado);

		if (posicao >= 0) {
			System.out.println("O número " + numeroDigitado + " foi encontrado na posição " + posicao);
		} else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}

		ler.close();
	}
}
