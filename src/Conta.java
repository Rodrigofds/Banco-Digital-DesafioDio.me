public abstract class Conta implements IConta {

	private static final Long AGENCIA_PADRAO = 1L;	
	private static Long SEQUENCIAL = 1L;
	
	protected Long agencia;
	protected Long numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.cliente = cliente;
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	public Long getAgencia() {
		return agencia;
	}

	public Long getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}


}
