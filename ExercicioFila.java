package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		/*
		 * Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo
		 * string, para organizar uma fila por ordem de chegada dos Clientes de um
		 * Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		 * 
		 * 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente. 2:
		 * Listar todos os Clientes na fila 3: Chamar (retirar) uma pessoa da fila 0: O
		 * programa deve ser finalizado. Caso a fila esteja vazia, o programa deverá
		 * informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.
		 */

		LinkedList<String> clientes = new LinkedList<String>();

		Scanner ler = new Scanner(System.in);



			System.out.println("***************** Menu *****************");
			System.out.println("\n1 - Adicionar novo cliente na fila");
			System.out.println("\n2 - Listar todos os clientes na fila");
			System.out.println("\n3 - Chamar (retirar) um cliente da fila");
			System.out.println("\n0 - Finalizar programa");
			System.out.println("*****************************************");

			while (true) {
			
			int opcao = ler.nextInt();
			ler.skip("\\R?");

			switch (opcao) {

			case 0:
				System.out.println("A fila está vazia!");
				System.exit(0);
				break;

			case 1:
				System.out.println("Digite o nome do cliente: ");
				String clienteAdd = ler.nextLine();
				clientes.add(clienteAdd);
				System.out.println("Cliente adicionado!");
				break;

			case 2:
				System.out.println(clientes);
				break;

			case 3:
				System.out.println("Cliente removido: " + clientes.remove());
				break;

			}

		}

	}

}
