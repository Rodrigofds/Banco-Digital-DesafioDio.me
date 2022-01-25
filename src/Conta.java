import java.math.BigDecimal;

public abstract class Conta implements IConta {

	private static final Long AGENCIA_PADRAO = 1L;	
	private static Long SEQUENCIAL = 1L;
	
	protected Long agencia;
	protected Long numero;
	protected BigDecimal saldo;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	public Long getAgencia() {
		return agencia;
	}

	public Long getNumero() {
		return numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacar(BigDecimal valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(BigDecimal valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(BigDecimal valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saldo() {
		// TODO Auto-generated method stub
		
	}

}
