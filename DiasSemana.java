package AvaliaSomativa;

import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {  //recebe argumentos da linha de comando
		Scanner ler = new Scanner (System.in);  //permite a leitura das variáveis
		
		int dia;  //declaração de variáveis do tipo inteiro
		
		System.out.println("Informe o dia da semana (1-7) ");  //a frase aparece na tela
		dia = ler.nextInt();  //o valor digitado pelo usuário é guardado na variável "dia", do tipo inteiro
		
		switch (dia) {  //switch executa as ações seguintes onde todos os casos dentro da chave do Switch se referem a variável "dia", que está entre parenteses
		case (1):  //1ª situação, caso usuário digite "1"
		System.out.println("O dia selecionado é domingo");  //a frase aparece na tela
		break;  //fim da 1ª situação
		
		case (2):  //2ª situação, caso usuário digite "2"
			System.out.println("O dia selecionado é segunda=feira");  //a frase aparece na tela
		break;  //fim da 2ª sitação
		
		case (3):  //3ª situação, caso usuário digite "3"
			System.out.println("O dia selecionado é terça-feira");  //a frase aparece na tela
		break;  //fim da 3ª situação
		
		case (4):  //4ª situação, caso usuário digite "4"
			System.out.println("O dia selecionado é quarta-feira");  //a frase aparece na tela
		break;  //fim da 4ª situação
		
		case (5):  //5ª situação, caso usuário digite "5"
			System.out.println("O dia selecionado é quinta-feira");  //a frase aparece na tela
		break;  //fim da 5ª situação
		
		case (6):  //6ª situação, caso usuário digite "6"
			System.out.println("O dia selecionado é sexta-feira");  //a frase aparece na tela
		break;  //fim da 6ª situação
		
		case (7):  //7ª situação, caso usuário digite "7"
			System.out.println("O dia selecionado é sábado");  //a frase aparece na tela
		break;  //fim da 7ª situação
		
		default:  //situação que abrange tudo que não foi especificado nas situações anteriores
			System.out.println("Dia inválido!");  //a frase aparece na tela
		break;  //fim caso
	}
		ler.close();  //encerra o scanner 

}
}