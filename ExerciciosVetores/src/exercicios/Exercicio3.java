package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	
	/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

	public static void main(String[] args) {

		int n, p = 1;
		double media=0, menor=0, total=0, percentalMenores;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:", p);
			System.out.print("\nNome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			p++;
			
			total += altura[i];
			
			if(idade[i] < 16) {
				menor++;
			}
		}
		
		media = total / n;
		percentalMenores = (menor / n) * 100.0;
		
		System.out.printf("\nAltura média: %.2f", media);
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%", percentalMenores);
		
		for (int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}
		}
	}

}
