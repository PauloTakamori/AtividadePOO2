package dados_funcionario;

public class Dados {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void incrementoSalario(double porcentagem) {
		this.salarioBruto += salarioBruto * porcentagem / 100;
		
	}
	
	public String toString() {
		return nome + ", " + String.format("R$ %.2f", salarioLiquido());
	}

}
