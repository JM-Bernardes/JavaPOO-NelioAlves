package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/
	
	public static void main(String[] args) {
		
		int n, posicao=0;
		double maior=0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicao++;
			}
		}
		
		System.out.printf("\nMaior valor: %.1f", maior);
		System.out.printf("\nPosição do maior valor: %d", posicao);
	}

}
