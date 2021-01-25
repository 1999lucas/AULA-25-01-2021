package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		
		Conta contaAnaGomes = new Conta();
		Conta contaDoJoao = new Conta();
		
		
		// CONTA DA ANA
		contaAnaGomes.setTitular("Ana Gomes");
		contaAnaGomes.setNumero("111-98");
		contaAnaGomes.setTipo("Poupança");
		contaAnaGomes.setAtiva(true);
		contaAnaGomes.setChequeEspecial(200);
		contaAnaGomes.depositar(100);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.depositar(30);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(50);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(500);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(50);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(80);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.depositar(100);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.getSaldo();
		contaAnaGomes.getSaldo();
		
		double saldoDaConta = contaAnaGomes.getSaldo();
		
		System.out.println("****O saldo da conta é "+ saldoDaConta);
		
		
		contaDoJoao.setTipo("Corrente");
		
		System.out.println("Nome: " + contaAnaGomes.getTitular());
		System.out.println("Conta: " + contaAnaGomes.getNumero());
		System.out.println("Tipo: " + contaAnaGomes.getTitular());
		System.out.println("Limite: " + contaAnaGomes.getChequeEspecial());
		
		
	}
}
