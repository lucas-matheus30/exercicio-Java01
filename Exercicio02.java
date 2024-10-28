package exercicioJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1,nota2,nota3,nota4;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira nota: ");
		nota1 = leitura.nextFloat();
		
		System.out.println("Digite o valor da segunda nota: ");
		nota2 = leitura.nextFloat();
		
		System.out.println("Digite o valor da terceira nota: ");
		nota3 = leitura.nextFloat();
		
		System.out.println("Digite o valor da quarta nota: ");
		nota4 = leitura.nextFloat();
		
		leitura.close();
		
		float media = (nota1+nota2+nota3+nota4) / 4;
		
		System.out.println("A média final do participante é: " + media);
		
	}

}
