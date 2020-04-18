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
		this.saldo -= valor;
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
	
	public String toString() {
		return "Ag: " + agencia + ", Conta: " + conta + ", Saldo: " + saldo;
	}
}
