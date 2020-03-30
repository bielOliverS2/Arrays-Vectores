package com.accenture.cursojava.aula19.jobs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
		
		int[] elementosA = new int[15];
		
		double[] elementosB = new double[elementosA.length];
		
		for(int i=0; i<elementosA.length; i++) {
			
			System.out.println("Entre com o Valor da Posição: " + i);
			elementosA[i] = new Scanner(System.in).nextInt();						
			elementosB[i] = Math.sqrt(elementosA[i]);
		}
		
		System.out.print("Elemento A = ");
		for(int i=0;i<elementosA.length;i++) {
			System.out.print(elementosA[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("Elemento B = ");
		for(int i=0;i<elementosB.length;i++) {
			System.out.print(df.format(elementosB[i]) + " ");
		}
		System.out.println();
		}
		
		
		
		

	}

