package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {
	
		/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
	devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
	da pessoa mais velha.*/

	public static void main(String[] args) {
		
		int n, p = 1, maiorIdade = 0;
		String maisVelha = null;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: ", p);
			System.out.print("\nNome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			p++;
			
			if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				maisVelha = nome[i];
			}
		}
		
		System.out.printf("\nPessoa mais velha: %s", maisVelha);			
	}

}
