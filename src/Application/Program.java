package Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitie.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func;
		System.out.println("How many employees will be registered?");
		int quantity = sc.nextInt();
		
		List<Funcionario> listFuncionario = new ArrayList<>();
		
		for(int i = 0; i < quantity; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.println("ID:");
			Integer id = sc.nextInt();
			System.out.println("NAME:");
			String name = sc.next();
			System.out.println("SALARY:");
			Double salary = sc.nextDouble();
			func = new Funcionario(id, name, salary);
			listFuncionario.add(func);
		}
		
		System.out.println("Enter the employee id that will have salary increase : ");
		Integer idMudanca = sc.nextInt();
		System.out.println("Enter the percentage:");
		Double percentage = sc.nextDouble();
		
		for (Funcionario funcionario : listFuncionario) {
		    if(idMudanca == funcionario.getId()) {
		    	funcionario.IncreaseSalary(percentage);
		    }
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for(Funcionario funcionario: listFuncionario) {
			System.out.println(funcionario);
		}
		
		
		
		sc.close();

	}

}
