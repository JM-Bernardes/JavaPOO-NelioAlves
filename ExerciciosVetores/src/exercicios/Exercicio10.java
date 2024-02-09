package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int n, p = 1;
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] n1 = new double[n];
		double[] n2 = new double[n];
		double[] soma = new double[n];
		double[] media = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: \n", p);
			nome[i] = sc.next();
			n1[i] = sc.nextDouble();
			n2[i] = sc.nextDouble();
			p++;
		
			soma[i] = n1[i] + n2[i];
			media[i] = soma[i] / 2;
		}
		
		System.out.println("\nAlunos Aprovados: ");
		
		for (int i = 0; i < n; i++) {
			if(media[i] >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
	}

}
