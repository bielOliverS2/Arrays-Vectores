package com.accenture.cursojava.aula19.jobs;

import java.util.Scanner;

public class Exec05 {

	public static void main(String[] args) {
		
		int[] elementosA = new int[10];		
		int[] elementosB = new int[elementosA.length];
		
		for(int i=0; i<elementosA.length; i++) {
			
			System.out.println("Entre com o Valor da Posi��o: " + i);
			elementosA[i] = new Scanner(System.in).nextInt();
			
			elementosB[i] = elementosA[i] * i;
		}
		
		System.out.print("Elemento A = ");
		for(int i=0;i<elementosA.length;i++) {
			System.out.print(elementosA[i] + " ");
		}
		System.out.println();				
		
		System.out.print("Elemento B = ");
		for(int i=0;i<elementosB.length;i++) {
			System.out.print(elementosB[i] + " ");
		}
		System.out.println();
		}
		
		
		
		

	}

