package contas;

import Clientes.Pessoa;

public class Conta extends Pessoa {
	int numeroConta;
	char tipo;
	Double saldo;
	Boolean status = Boolean.FALSE;

	public Conta() {
		
	}
	public Conta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Conta(int numeroConta, char tipo, Double saldo,Boolean status, String nome, Long cpf) {
		super(nome, cpf);
		this.numeroConta = numeroConta;
		this.tipo = tipo;
		this.saldo = saldo;
		this.status = status;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
