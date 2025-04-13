package banco;

public interface BancodeDados {
	

	public void transferir(double Valor ,Conta contaDestino );
	
	public void sacar(double Valor ) ;
	
	public void depositar(double Valor );
	
	public void imprimirExtrato();
}