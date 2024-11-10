package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		// First in, first out >> primeiro que entra é o primeiro que sai
		
		
		LinkedList<String> fila = new LinkedList<String>();
		
		// 1 argumento: nome da fila, 2 argumento: argumentos da fila
		Collections.addAll(fila, "Gabriel", "Priscila", "Kaue");
		
		System.out.println(fila);
		
		System.out.println("\nAdicionar novo elemento: " + fila.add("Fatima"));
		
		System.out.println(fila);
		
		System.out.println("\nExibir o 1º elemento da fila: " + fila.peek());

		System.out.println(fila);

		System.out.println("\nRemover 1º elemento da fila " + fila.remove());


	}

}
