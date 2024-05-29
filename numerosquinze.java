package AvaliaSomativa;

import java.util.Scanner;

public class numerosquinze {

	public static void main(String[] args) {  //recebe argumentos da linha de comando
		Scanner ler = new Scanner (System.in);  //permite a leitura das variáveis

		int num,som=0;  //declaração de variáveis do tipo inteiro
		for(int i=1; i <=15 ; i++) {  //inicia uma estrutura de repetição que repete os comandos abaixo até que "i" seja maior que 15
		System.out.print("Digite um valor: ");  //a frase aparece na tela
		num = ler.nextInt(); //o valor digitado pelo usuário é guardado na variável "num", do tipo inteiro
		som=som+num;  //o valor da equação "som+num" é guardado na variável "som"

		}
		System.out.println("A soma dos valores é: " +som);  //apresenta o resultado da soma dos valores na tela na tela 
ler.close();  //encerra o scanner 
	}
}
