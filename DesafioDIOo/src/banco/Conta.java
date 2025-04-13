package banco;

public abstract class Conta implements BancodeDados {
	
	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;




	public Conta() {
		setAgencia(AGENCIA_PADRAO);
		setNumero(SEQUENCIAL++);
	}
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	@Override
	public void sacar(double Valor) {
		saldo -= Valor;
	}

	@Override
	public void depositar(double Valor) {
		saldo += Valor;
	}

	@Override
	public void transferir(double Valor,Conta contaDestino) {
		this.sacar(Valor);
		contaDestino.depositar(Valor);
	}
	protected void imprimirInfo() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
}
