
public class TestaFuncionario {
public static void main(String[] args) {
	
	Endereco endereco = new Endereco();
	
	endereco.logradouro = "casa";
	endereco.numero = "34A";
	endereco.bairro = "Av. Guilherme";
	endereco.cidade = "S�o Paulo";
	endereco.estado = "S�o Paulo";
	
	Funcionario func = new Funcionario();
	
	func.endereco = endereco;
	func.cargo = "Faxineiro";
	func.salario = 1000000.5;
	
	System.out.println("Cargo: " + func.cargo + "\nSalario: " + func.salario + "\nLogradouro: " + func.endereco.logradouro + "\nN�mero: " + func.endereco.numero + "\nBairro: " + func.endereco.bairro + "\nCidade: " + func.endereco.cidade + "\nEstado: " + func.endereco.estado);
}
}
