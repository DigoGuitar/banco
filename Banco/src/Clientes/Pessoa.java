package Clientes;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Pessoa {
	String nome;
	Long cpf;
	String dataNascimento;
	int idade;
	int cep;

	public Pessoa(String nome, Long cpf, String dataNascimento, int idade, int cep) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.cep = cep;
	}

	public Pessoa() {
		super();
	}

	public Pessoa(String nome2, Long cpf2) {
		this.nome = nome2;
		this.cpf = cpf2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int calcularIdade(String dataNascimneto) {
		Date dataNasc = new Date(dataNascimento);
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(dataNasc);
		Calendar hoje = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
		
		int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
		
//		System.out.print(dataNascimento.get(Calendar.MONTH));
		if (hoje.get(Calendar.MONTH + 1) < dataNascimento.get(Calendar.MONTH + 1)) {
			idade--;
		} else if (hoje.get(Calendar.MONTH + 1) == dataNascimento.get(Calendar.MONTH + 1)
				&& hoje.get(Calendar.DAY_OF_MONTH - 1) < dataNascimento.get(Calendar.DAY_OF_MONTH - 1 )) {
			idade--;
		}
		return idade;

	}
}
