package collections;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {

		/*
		 * Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string,
		 * para organizar a retirada de livros de uma pilha. O programa deverá ter um
		 * Menu que aceitará as opções 0, 1, 2 e 3:
		 * 
		 * 1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro. 2:
		 * Listar todos os livros da Pilha 3: Retirar um livro da pilha 0: O programa
		 * deve ser finalizado. Caso a pilha esteja vazia, ao tentar retirar um livro da
		 * pilha, o programa deverá informar que a pilha está vazia.
		 * 
		 */

		// Last in, last out >> último que entra é o primeiro que sai

		Stack<String> livros = new Stack<String>();

		Scanner ler = new Scanner(System.in);

		while (true) {

			int opcao;

			System.out.println("**************** Menu **************\n");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros na pilha");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Finalizar programa");
			System.out.println("\n***********************************\n");
			opcao = ler.nextInt();
			ler.skip("\\R?");

			switch (opcao) {

			case 1:
				System.out.println("\nDigite o título do livro: ");
				String livroAdd = ler.nextLine();
				livros.push(livroAdd);
				System.out.println("\nLivro adicionado!\n");
				break;

			case 2:
				System.out.println("Listar todos os livros: " + livros + "\n");
				break;

			case 3:
				System.out.println("Livro removido: " + livros.pop() + "\n");
				break;

			case 0:
				ler.close();
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida!");
				break;

			}

		}

	}

}
