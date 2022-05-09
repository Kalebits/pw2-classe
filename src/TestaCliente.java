
public class TestaCliente {
public static void main(String[] args) {
	Cliente c1 = new Cliente();
	
	c1.nome = "Ana";
	c1.codigo = 1;
	c1.status = StatusClienteEnum.ATIVO;
	Cartao credito = new Cartao();
	credito.numero = "12345";
	credito.cliente = c1;
	credito.data_val = "2/2025";
	credito.status = TipoCartaoEnum.CREDITO;
	
	
}	
}
