package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollectionSet2 {

	public static void main(String[] args) {

				Set<Integer> numeros = new HashSet<>();
				numeros.add(2);
				numeros.add(5);
				numeros.add(1);
				numeros.add(3);
				numeros.add(4);
				numeros.add(9);
				numeros.add(7);
				numeros.add(8);
				numeros.add(10);
				numeros.add(6);

				Scanner ler = new Scanner(System.in);

				System.out.print("Digite um número inteiro: ");
				while (!ler.hasNextInt()) {
					System.out.println("Digite apenas números inteiros.");
					ler.next();
				}
				int numeroDigitado = ler.nextInt();

				if (numeros.contains(numeroDigitado)) {
					System.out.println("Número " + numeroDigitado + " encontrado!");
				} else {
					System.out.println("Número " + numeroDigitado + " não encontrado!");
				}

				ler.close();
			}
		}
		

