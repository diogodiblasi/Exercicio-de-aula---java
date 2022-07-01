package br.senac.rj.teste;

public class ContaCorrenteEspecial extends Conta{
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean saca(double valor) {
		double novoSaldo = this.saldo - valor;
		if(novoSaldo < (this.limite*-1)) {
			System.out.println("N�o h� limite dispon�vel");
			return false;
		}
	
		this.saldo = novoSaldo;
		return true;
	
	

}
