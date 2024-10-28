package exercicioJava;

import java.util.Scanner;

public class Exercicio03 {
 public static void main(String[] args) {
	Scanner leitura = new Scanner (System.in);
	
	Float SalarioBruto,AdicionalNoturno,HorasExtras,Descontos;
	
	System.out.println("Digite o valor do salário bruto: ");
	SalarioBruto = leitura.nextFloat();
	
	System.out.println("Digite o valor do Adicional Noturno: ");
	AdicionalNoturno = leitura.nextFloat();
	
	System.out.println("Digite o valor das Horas Extras: ");
	HorasExtras = leitura.nextFloat();
	
	System.out.println("Digite o valor dos descontos: ");
	Descontos = leitura.nextFloat();
	
	leitura.close();

	float SalarioLiquido = SalarioBruto + AdicionalNoturno + (HorasExtras * 5) - Descontos;
	
	System.out.println("O salário do colaborador após adicionais e descontos: R$ " + SalarioLiquido);

 }
 
}
