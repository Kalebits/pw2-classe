
public class TestaTurma {
public static void main(String[] args) {
	Turma turma = new Turma();
	
	turma.periodo = "Manhã";
	turma.serie = "Segundo ano de Desenvolvimento de Sistemas";
	turma.sigla = "2AI";
	turma.tipo = "Ensino Médio";
	
	System.out.println("Período: " + turma.periodo + "\nSérie: " + turma.serie + "\nSigla: " + turma.sigla + "\nTipo: " + turma.tipo);
}
}
