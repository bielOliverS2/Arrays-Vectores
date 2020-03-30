package com.accenture.cursojava.aula19.jobs;

import java.util.Scanner;

public class Exec11 {

	public static void main(String[] args) {
		
		int[] elementosA = new int[10];
		
		/*elementosA[0] = 2;
		elementosA[1] = 3;
		elementosA[2] = 4;
		elementosA[3] = 5;
		elementosA[4] = 6;
		elementosA[5] = 7;
		elementosA[6] = 8;
		elementosA[7] = 9;
		elementosA[8] = 10;
		elementosA[9] = 11;*/								
		
		for(int i=0;i<elementosA.length;i++) {
			
			System.out.println("Entre com o Valor da Posição: " + i);
			elementosA[i] = new Scanner(System.in).nextInt();
			
			if((elementosA[i]%2)==0) {
				
				System.out.println("Elemento Numero " + elementosA[i] + " é Par");
				
			}else {
				System.out.println("Elemento Numero " + elementosA[i] + " é Impar");
			}
			
		}

	}

}
