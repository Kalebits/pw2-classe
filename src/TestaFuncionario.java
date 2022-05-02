
public class TestaFuncionario {
public static void main(String[] args) {
	Funcionario func = new Funcionario();
	
	func.cargo = "Faxineiro";
	func.salario = 1000000.5;
	
	System.out.println("Cargo: " + func.cargo + "\nSalario: " + func.salario );
}
}
