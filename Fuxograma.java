package AvaliaSomativa;

import java.util.Scanner;

public class Fuxograma {

	public static void main(String[] args) {  //recebe argumentos da linha de comando
		Scanner ler = new Scanner (System.in);  //permite a leitura das variáveis
		
		Double a,b,som,sub,mult,div;  //declaração de variáveis do tipo real
		
		System.out.print("Informe o primeiro valor: ");  //a frase aparece na tela
		a = ler.nextDouble();  //o valor digitado pelo usuário é guardado na variável "a", do tipo real
		
		System.out.print("Informe o segundo valor: ");  //a frase aparece na tela
		b = ler.nextDouble();  //o valor digitado pelo usuário é guardado na variável "b", do tipo real
		
		som = a+b;  //o valor da equação "a+b" é guardado na variável "som"
		sub = a-b;  //o valor da equação "a-b" é guardado na variável "sub"
		mult = a*b;  //o valor da equação "a*b" é guardado na variável "mult"
		div = a/b;  //o valor da equação "a/b" é guardado na variável "div"
		
		System.out.println("A soma dos valores é "+som);  //apresenta o resultado da soma na tela na tela 
		System.out.println("A subtração dos valores é "+sub);  //apresenta o resultado da subtração na tela na tela 
		System.out.println("A multiplicação dos valores é "+mult);  //apresenta o resultado da multiplicação na tela na tela 
		System.out.println("A divisão dos valores é "+div);  //apresenta o resultado da divisão na tela na tela 
		
		ler.close();  //encerra o scanner
	}

}
