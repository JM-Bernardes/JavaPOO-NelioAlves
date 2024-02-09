package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
	mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
	os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/
	
	public static void main(String[] args) {
		
		int n;
		double soma = 0, media;

		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um número: ");
			vetor[i] = sc.nextDouble();
			
			soma+=vetor[i];
		}
		
		media = soma / n;
		
		System.out.printf("\nMédia do vetor: %.3f", media);
		System.out.print("\n\nElementos abaixo da média: ");
		
		for (int i = 0; i < n; i++) {
			
			if(vetor[i] < media) {
				System.out.printf("\n%.1f", vetor[i]);
			}
		}
		
	}

}
