
public class Main {

	public static void main(String[] args) {
		var cliente1 = new Cliente();
		cliente1.setNome("Rodrigo");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);
		
		cc.depositar(100);
		cc.transferir(50, poupanca);
		poupanca.imprimirExtrato();
		cc.imprimirExtrato();

	}

}
