package exercicioJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3,n4;
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Digite o valor de n1? ");
		n1 = leitura.nextFloat();
		
		System.out.println("Digite o valor de n2? ");
		n2 = leitura.nextFloat();
		
		System.out.println("Digite o valor de n3? ");
		n3 = leitura.nextFloat();
		
		System.out.println("Digite o valor de n4? ");
		n4 = leitura.nextFloat();
	
		
		float Calculo;
		Calculo = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença do produto entre n1 e n2 pelo produto n3 e n4, é : " + Calculo);
		
		System.out.println("Digite o valor de n1? ");
		n1 = leitura.nextFloat();
		
		System.out.println("Digite o valor de n2? ");
		n2 = leitura.nextFloat();
		
		System.out.println("Digite o valor de n3? ");
		n3 = leitura.nextFloat();
		
		System.out.println("Digite o valor de n4? ");
		n4 = leitura.nextFloat();
		
		leitura.close();
		
		float Calculo2;
		Calculo2 = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença do produto entre n1 e n2 pelo produto n3 e n4, é : " + Calculo2);
	}

}