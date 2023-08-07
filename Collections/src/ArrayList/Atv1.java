package ArrayList;
//Escreva um programa Java para criar uma Collection ArrayList de Objetos da
//Classe String. O programa deverá solicitar ao usuário, que ele digite via teclado 5 
//cores e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
//Mostre na tela todas as cores que foram adicionadas. 
//Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> cores = new ArrayList<>();
		Scanner leia = new Scanner (System.in);
		
		for (int i = 0; i<5; i++) {
			System.out.println("\nDigite a cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
			
			System.out.println("\nCores adicionadas:");
	        for (String cor1 : cores) {
	            System.out.println(cor1);
	        }
	        Collections.sort(cores);
	        System.out.println("\nCores em ordem crescente:");
	        for (String cor1 : cores) {
	            System.out.println(cor1);
	        }
			
		}
		
		

	}

}
