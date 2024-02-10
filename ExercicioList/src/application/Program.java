package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão registrados: ");
		int n = sc.nextInt();
		
		List <Funcionario> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nFuncionário #" + (i+1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			while(temId(list, id)) {
					System.out.print("ID já cadastrado, tente novamente: ");
					id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			list.add(new Funcionario(id, nome, salario));
		}
		
		System.out.print("\nEntre com o ID do funcionário que terá o aumento de salário:");
		int id = sc.nextInt();
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(func == null) {
			System.out.print("Essa ID não existe.");
		}
		else {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			func.aumentaSalario(porcentagem);
		}
		
		System.out.println("\nLista de funcionários:\n");
			
		for (Funcionario x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}
	
	public static boolean temId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}


}
