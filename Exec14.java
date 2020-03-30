package com.accenture.cursojava.aula19.jobs;

import java.util.Scanner;

public class Exec14 {

	public static void main(String[] args) {
		
		int[] elementosA = new int[10];
		int valorTotal = 0;
		int totalImpares = 0;
		double valorDividido = 0;
		
		for(int i=0;i<elementosA.length;i++) {					
			
			System.out.println("Entre com o Valor da Posição: " + i);
			elementosA[i] = new Scanner(System.in).nextInt();
			
			if((elementosA[i]%2)==0) {
				
			}else {
				totalImpares = totalImpares + 1;
				valorTotal = valorTotal + elementosA[i];
						
			}					
			
		}
		
		valorDividido = valorTotal / totalImpares;
		System.out.println("Valor Total : " + valorDividido);

	}

}
