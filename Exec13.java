package com.accenture.cursojava.aula19.jobs;

import java.util.Scanner;

public class Exec13 {

	public static void main(String[] args) {
		
		int[] elementosA = new int[10];
		
		/*elementosA[0] = 1;
		elementosA[1] = 2;
		elementosA[2] = 3;
		elementosA[3] = 4;
		elementosA[4] = 5;
		elementosA[5] = 6;
		elementosA[6] = 7;
		elementosA[7] = 8;
		elementosA[8] = 9;
		elementosA[9] = 10;*/								
		
		int valorTotal = 0;
		
		for(int i=0;i<elementosA.length;i++) {
			
			System.out.println("Entre com o Valor da Posição: " + i);
			elementosA[i] = new Scanner(System.in).nextInt();
			
			if((elementosA[i]%5)==0) {
				
				valorTotal = valorTotal + elementosA[i];
				
			}			
		}
		
		System.out.println("Valor da Soma dos Numeros Multiplos de 5: " + valorTotal);

	}

}
