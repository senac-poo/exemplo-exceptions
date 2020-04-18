import banco.Conta.Conta;

public class Banco {
	// Serviço
	public void depositar(Conta conta, double valor) {
		conta.creditar(valor);
	}
	
	public void depositarEspecial(Conta conta, double valor) {
		conta.creditar(valor*0.99);
	}
}
