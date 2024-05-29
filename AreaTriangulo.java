package AvaliaSomativa;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {  //recebe argumentos da linha de comando
		Scanner ler = new Scanner (System.in);  //permite a leitura das variáveis
		Double altura,base,area;  //declaração de variáveis do tipo real
		
		System.out.print("Insira a altura do triângulo: ");  //a frase aparece na tela
		altura = ler.nextDouble();  //o valor digitado pelo usuário é guardado na variável "altura", do tipo real
		
		System.out.print("Insira a medida da base do triângulo: ");  //a frase aparece na tela
		base = ler.nextDouble();  //o valor digitado pelo usuário é guardado na variável "base", do tipo real
		
		area = (base*altura)/2;  //o valor da equação "(base*altura)/2" é guardado na variável "area"
		
		System.out.println("A área do triângulo é "+area);  //apresenta o resultado da area na tela na tela 
		ler.close();  //encerra o scanner
	}

}
