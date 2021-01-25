package br.senai.sp.jandira.model;

public class Cliente { // - POJO Plain Old Java Object

	
	private String nome;
	private String cpf;
	private String telefone;
	private String cep;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String gerNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}
	
	public String getCpf() {
		return.this.cpf;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return.this.telefone;
	}	
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String.getCep() {
		return.this.cep;
	}
}
