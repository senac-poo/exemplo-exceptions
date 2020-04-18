package banco.Conta;

public abstract class Conta {
	private int agencia;
	private int conta;
	private double saldo;
	
	public Conta(int agencia, int conta) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = 0.0;
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public void debitar(double valor) {
		this.saldo -= (valor + descontarCPMF(valor));
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}	
	
	public int getConta() {
		return this.conta;
	}		
	
	private double descontarCPMF(double valor) {
		return valor*0.0025;
	}
	
	public String toString() {
		return "Ag: " + agencia + ", Conta: " + conta + ", Saldo: " + saldo;
	}
}
