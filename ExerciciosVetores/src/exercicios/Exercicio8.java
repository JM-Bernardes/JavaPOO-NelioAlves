package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
	
	/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

	public static void main(String[] args) {
		
		int n, qtdPar = 0;
		double soma = 0, media;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];
				qtdPar++;
			}
		}
		
		media = soma / qtdPar;
		
		if(qtdPar > 0) {
			System.out.printf("Média dos números pares: %.1f", media);
		}else {
			System.out.print("Nenhum número par.");
		}
		
	}

}
