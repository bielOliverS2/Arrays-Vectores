package com.accenture.cursojava.aula19.jobs;

import java.util.Scanner;

public class Exec09 {

	public static void main(String[] args) {
	
		int[] elementosA = new int[10];		
		int[] elementosB = new int[elementosA.length];
		float[] elementosC = new float[elementosA.length];
		
		for(int i=0; i<elementosA.length; i++) {
			
			System.out.println("Entre com o Valor da Posição do Elemento A: " + i);
			elementosA[i] = new Scanner(System.in).nextInt();
			System.out.println("Entre com o Valor da Posição do Elemento B: " + i);
			elementosB[i] = new Scanner(System.in).nextInt();
			
			elementosC[i] = elementosA[i] / elementosB[i];
		}
		
		System.out.print("Elemento A = ");
		for(int i=0;i<elementosA.length;i++) {
			System.out.print(elementosA[i] + " ");
		}
		System.out.println(" + ");				
		
		System.out.print("Elemento B = ");
		for(int i=0;i<elementosB.length;i++) {
			System.out.print(elementosB[i] + " ");
		}
		System.out.println(" = ");
		
		System.out.print("Elemento C = ");
		for(int i=0;i<elementosC.length;i++) {
		System.out.print(elementosC[i] + " ");
		
		}
		
		System.out.println();
		
		}							

	}


