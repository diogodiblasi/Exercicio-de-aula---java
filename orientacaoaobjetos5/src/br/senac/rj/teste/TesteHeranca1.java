package br.senac.rj.teste;

import java.util.Scanner;

public class TesteHeranca1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Entre com o limite da conta especial:");
		double limite = Double.parseDouble(sc.nextLine());
		System.out.println("Entre com o valor a sacar");
		double valorSaque = Double.parseDouble(sc.nextLine());
		ContaCorrenteEspecial cce1 = new ContaCorrenteEspecial (22, 375);
		System.out.println("Número da agência da conta corrente especial = " + cce1.getAgencia());
		System.out.println("Número da conta da conta corrente especial = " + cce1.getNumero());
		System.out.println("Título da conta corrente especial = " + cce1.getTitular());
		cce1.setLimite(limite);
		if(!cce1.saca(valorSaque, 10))
			System.out.println("Não foi possível efetuar o saque na conta corrente");
		else
			System.out.println("Novo saldo da conta corrente especial = " + cce1.getSaldo());
		ContaCorrenteNormal ccn1 = new ContaCorrenteNormal();
		System.out.println("Número da agência da conta corrente normal = " +cce1.getAgencia());
		System.out.println("Número da conta da conta corrente normal = " + cce1.getNumero());
		System.out.println("Título da conta corrente normal = " + cce1.getTitular());
		if (!ccn1.saca(valorSaque))
			System.out.println("Não foi possível efetuar o saque na conta corrente normal");
		else
			System.out.println("Novo saldo da conta corrente  = " + ccn1.getSaldo());
	}
	

}
