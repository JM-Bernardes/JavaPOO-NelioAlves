package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
	
	/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
	que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
	de homens.*/

	public static void main(String[] args) {
		
		int n, p = 1, homem = 0, mulher = 0;
		double menorAltura = 9999.9, maiorAltura = 0.0, soma = 0.0, media = 0.0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", p);
			altura[i] = sc.nextDouble();
			System.out.printf("Gênero da %da pessoa: ", p);
			genero[i] = sc.next().charAt(0);
			p++;
			
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
			if(genero[i] == 'F'|| genero[i] == 'f') {
				soma += altura[i];
				mulher++;
			}
			if(genero[i] == 'M' || genero[i] == 'm') {
				homem++;
			}
		}
		
		media = soma / mulher;
		
		System.out.printf("\nMenor altura: %.2f", menorAltura);
		System.out.printf("\nMaior altura: %.2f", maiorAltura);
		System.out.printf("\nMédia de altura das mulheres: %.2f", media);
		System.out.printf("\nNúmero de homens: %d", homem);

	}

}
