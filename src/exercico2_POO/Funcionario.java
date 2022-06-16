package exercico2_POO;

import java.util.Locale;
import java.util.Scanner;

import dados_funcionario.Dados;

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		Dados funcionario = new Dados();
		
		System.out.print("Nome: ");
		funcionario.nome = tc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = tc.nextDouble();
		System.out.print("Taxas: ");
		funcionario.taxa = tc.nextDouble();
		
		System.out.println();
		System.out.println("Dados do Funcionario: "+funcionario);
		System.out.println();
		System.out.printf("Quantos porcento de aumento para o funcionario: ");
		double porcentagem = tc.nextDouble();
		funcionario.incrementoSalario(porcentagem);
		System.out.println();
		System.out.println("Dados atualizados: "+funcionario);
		tc.close();

	}

}
