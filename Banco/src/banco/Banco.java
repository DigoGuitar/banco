package banco;

import contas.Conta;

public class Banco extends Conta{
	
	Double valorDeposito;
	
	
	public Banco() {
		super();
	}

	public Banco(int numeroConta,
			Double valorDeposito) {
		super(numeroConta);
		this.valorDeposito = valorDeposito;
	}

	public Double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(Double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

	public void sacar(Conta conta, Double valor) {
		if(conta.getStatus() != Boolean.TRUE) {
			System.out.println("A conta "+ conta.getNumeroConta() + " está inativa");
		}else if(valor <= 0) {
			System.out.println("O valor para saque deve ser maior que 0");
		}
		else if(conta.getSaldo() < valor) {
			System.out.println("Não há saldo suficiente em conta");
		}
		conta.setSaldo(conta.getSaldo() - valor);
	}
	
	public void depositar(Conta conta, Double valor) {
		if(conta.getStatus() != Boolean.TRUE) {
			System.out.println("A conta "+ conta.getNumeroConta() + " está inativa");
		}else if(valor <= 0) {
			System.out.println("O valor para deposito deve ser maior que 0");
		}
		conta.setSaldo(conta.getSaldo() + valor);
	}
	
	public void alterarStatusConta(Conta conta, Boolean status) {
		
		if(conta.getStatus() == status) {
			String st = (conta.getStatus() == Boolean.TRUE) ? "Ativa" : "Inativa";
			System.out.println("A conta "+conta.getNumeroConta() + " já está "+ st);
		}
		conta.setStatus(status);
	}
	
	public void depositarLista(Conta[] contas, Banco [] depositos) {
		for(int i = 0; contas.length > i; i++) {	
			for(int j = 0; depositos.length >j; j++) {		
				if(contas[i].getNumeroConta() == depositos[j].getNumeroConta()) {
					System.out.println("Estamos depositando "+ depositos[j].getValorDeposito());
					depositar(contas[i],depositos[j].getValorDeposito());
				}
			}
			System.out.println("O saldo da conta do proprietario "+contas[i].getNome() +" agora é de "+ contas[i].getSaldo() );
		}
	}
	
	

}
