package com.accenture.cursojava.aula19.jobs;

import java.util.Scanner;

public class Exec12 {

	public static void main(String[] args) {
		
		int[] elementosA = new int[10];
		int valorTotal = 0;
		
		for(int i=0;i<elementosA.length;i++) {					
			
			System.out.println("Entre com o Valor da Posição: " + i);
			elementosA[i] = new Scanner(System.in).nextInt();
			
			valorTotal = valorTotal + elementosA[i];						
			
		}
		
		System.out.println("Valor Total : " + valorTotal);

	}

}
