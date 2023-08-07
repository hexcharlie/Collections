package Set;
//Escreva um programa Java para criar uma Collection Set de Objetos da Classe 
//Wrapper Integer, inicializada com 10 valores inteiros. O programa deverá solicitar ao
//usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set,
//exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja 
//encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> numeros = new HashSet<>();
		Scanner leia = new Scanner (System.in);
		
        numeros.add(23);
        numeros.add(55);
        numeros.add(24);
        numeros.add(12);
        numeros.add(45);
        numeros.add(67);
        numeros.add(69);
        numeros.add(83);
        numeros.add(94);
        numeros.add(130);
        
        System.out.println("\nDigite um número: ");
        int numerob = leia.nextInt();
        if(numeros.contains(numerob)) {
        	System.out.println("\nNúmero "+numerob+" foi encontrado!!! :)");
        }else {
        	System.out.println("Número não encontrado! :(");
        }
        
        

	}

}
