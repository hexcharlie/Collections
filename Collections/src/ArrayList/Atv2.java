package ArrayList;
//Escreva um programa Java para criar uma Collection ArrayList de Objetos da
//Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa deverá
//solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja 
//encontrado no ArrayList, exiba na tela a posição deste número na Collection. Caso o
//número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> numero = new ArrayList <Integer>();
		
		numero.add(32);
		numero.add(222);
		numero.add(187);
		numero.add(33);
		numero.add(1);
		numero.add(8);
		numero.add(12);
		numero.add(24);
		numero.add(11);
		numero.add(39);
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o número que deseja localizar: ");
		int numerob = leia.nextInt();
		
		int posicao = numero.indexOf(numerob);
		if (posicao != 1) {
			System.out.println("\nO numero "+numerob+" foi encontrado na posição "+posicao+"!!!");
			
		}else {
			System.out.println("\nO numero não foi encontrado em nenhuma posição! :( ");
		}
		
		
	}

}
