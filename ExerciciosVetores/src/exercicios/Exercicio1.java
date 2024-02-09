package exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1 {
	
	/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
	e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

	public static void main(String[] args) {
		
		int n = 10;
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nNúmeros negativos: ");
		
		for (int i = 0; i < n; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
	}

}
