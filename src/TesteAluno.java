
public class TesteAluno {
public static void main(String[] args) {
	
	Turma turma = new Turma();
	
	turma.periodo = "Manh�";
	turma.serie = "Segundo ano de Desenvolvimento de Sistemas";
	turma.sigla = "2AI";
	turma.tipo = "Ensino M�dio";
	
	Aluno aluno = new Aluno();
	
	aluno.nome = "Marcelo";
	aluno.rg = "52382758-2";
	aluno.datanasc = "18/02/2004";
	aluno.turma = turma;
	
	
	System.out.println("Nome: " + aluno.nome + "\nRG: " + aluno.rg + "\nData de Nascimento: " + aluno.datanasc + "\nPer�odo: " + aluno.turma.periodo + "\nS�rie: " + aluno.turma.serie + "\nSigla: " + aluno.turma.sigla + "\nTipo: " + aluno.turma.tipo);
}
}
