
public class TesteAluno {
public static void main(String[] args) {
	
	
	
	Aluno aluno = new Aluno();
	
	aluno.nome = "Marcelo";
	aluno.rg = "52382758-2";
	aluno.datanasc = "18/02/2004";
	
	System.out.println("Nome: " + aluno.nome + "\nRG: " + aluno.rg + "\nData de Nascimento: " + aluno.datanasc);
}
}
