package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
	- Imprimir todos os elementos do vetor
	- Mostrar na tela a soma e a média dos elementos do vetor*/
	
	public static void main(String[] args) {
		
		int n;
		double soma=0, media;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma = soma + vetor[i];
		}
		
		
		System.out.print("Valores: ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f  ", vetor[i]);
			
		}
		
		media = soma / n;
		
		System.out.printf("\nSoma: %.1f", soma);
		System.out.printf("\nMédia: %.1f", media);
	}
	

}
