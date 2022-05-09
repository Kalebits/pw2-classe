
public class TesteBanco {
public static void main(String[] args) {
	
	AgenciaBanco agb1 = new AgenciaBanco();
	agb1.agenciaNum = 1;
	
	ContaDoBanco cdb1 = new ContaDoBanco();
	
	cdb1.numero = "12345";
	cdb1.saldo = "1234";
	cdb1.limite = "10000";
	cdb1.agencia = agb1;
	
	System.out.println("Agencia: " + agb1.agenciaNum + "\nNumero da Conta: " + cdb1.numero + "\nSaldo: " + cdb1.saldo + "\nLimite: " + cdb1.limite );
}
}
