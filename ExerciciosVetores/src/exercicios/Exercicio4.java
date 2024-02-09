package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
	tela todos os números pares, e também a quantidade de números pares.*/
	
	public static void main(String[] args) {
		
		int n, qtdPares = 0;
		
		Scanner sc= new Scanner(System.in);	
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			
		}
		
		System.out.printf("\nNúmeros pares: \n");
		
		for (int i = 0; i < n; i++) {
			
			if(vetor[i] % 2 == 0) {
				System.out.printf("%d   " ,vetor[i]);
				qtdPares+=1;
			}
		}
		
		System.out.printf("\n\nQuantidade de pares: %d", qtdPares);
				
	}

}
