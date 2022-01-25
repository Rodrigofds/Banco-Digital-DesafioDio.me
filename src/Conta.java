import java.math.BigDecimal;

public abstract class Conta implements IConta {

	private int agencia;
	private int numero;
	private BigDecimal saldo;
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
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
