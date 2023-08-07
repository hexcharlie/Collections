package Set;
//Escreva um programa Java para criar uma Collection Set de Objetos da Classe
//Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via teclado
//10 valores inteiros não repetidos e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
//Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> numeros = new HashSet<>();
		Scanner leia = new Scanner(System.in);
		
		for (int hi = 1; hi <=10; hi++){
			System.out.println("\nDigite um número #"+ hi +": ");
			int numerob = leia.nextInt();
			
			if (!numeros.contains(numerob)) {
                numeros.add(numerob);
			
			
		}else {
			System.out.println("\nEsse número ja foi inserido, tente novamente");
			
		}System.out.println("\nElementos da coleção:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
			
		
			
			
		}
		
		

	}
	}


