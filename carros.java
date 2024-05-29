package AvaliaSomativa;

import java.util.Scanner;

public class carros {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String garagem[] = new String[6];
		
		for(int i =0; i<6; i++) {
			System.out.print("Informe a marca do carro a ser estacionado: ");
			garagem[i] = ler.next();
		}
		for(int i =0; i<6; i++) {
			System.out.println("O carro "+garagem[i]+" foi estacionado na vaga "+i);
		}
		ler.close();
	}

}
