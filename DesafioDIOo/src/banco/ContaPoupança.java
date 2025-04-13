package banco;

public class ContaPoupança extends Conta{

	@Override
	public void imprimirExtrato() {
		System.out.println(" EXTRATO DA POUPANÇA ");
		super.imprimirInfo();
	}

}

	
	
		
	
	
