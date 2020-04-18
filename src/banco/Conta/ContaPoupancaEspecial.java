package banco.Conta;
public class ContaPoupancaEspecial extends Conta {
	public ContaPoupancaEspecial(int agencia, int conta) {
		super(agencia, conta);
		super.creditar(10.0);
	}
	
	@Override
	public void creditar(double valor) {
		super.creditar(valor*1.1);
	}
}
