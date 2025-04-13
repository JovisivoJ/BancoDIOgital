package banco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupança();
		Conta invest = new Investimento();
		/*invest deve tentar ser apenas "transferir" outros pode*/
		
		cc.depositar(21);
		poupanca.depositar(13);
		cc.transferir(10, invest);
		
		
		cc.imprimirInfo();
		poupanca.imprimirInfo();
		invest.imprimirInfo();
	}

}
