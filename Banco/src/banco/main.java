package banco;

import java.util.Random;

import contas.Conta;

public class main {
	
	static Random random = new Random();
	


	public static void main(String[] args) {
		
		final int contaGui = random.nextInt(10000);
		Conta guilherme = new Conta(contaGui, 'C', 2200.00, Boolean.TRUE, "Guilherme", new Long(565464646));
		
		final int contaRodri = random.nextInt(10000);
		Conta rodri = new Conta(contaRodri, 'C', 2200.00, Boolean.TRUE, "Rodri", new Long(2587875));
		
		final int contaAd = random.nextInt(10000);
		Conta ad = new Conta(contaAd, 'C', 2200.00, Boolean.TRUE, "Ad", new Long(57575757));
		
		Conta contasCriadas [] = new Conta [3];
		contasCriadas[0] = guilherme;
		contasCriadas[1] = rodri;
		contasCriadas[2] = ad;
		
		Banco listaDepositos [] = new Banco [8];
		listaDepositos[0] = new Banco(guilherme.getNumeroConta(), 20.0);
		listaDepositos[1] = new Banco(guilherme.getNumeroConta(), 300.0);
		listaDepositos[2] = new Banco(guilherme.getNumeroConta(), 25.0);
		listaDepositos[3] = new Banco(guilherme.getNumeroConta(), 500.0);
		listaDepositos[4] = new Banco(rodri.getNumeroConta(), 30.0);
		listaDepositos[5] = new Banco(rodri.getNumeroConta(), 900.0);
		listaDepositos[6] = new Banco(rodri.getNumeroConta(), 1000.0);
		listaDepositos[7] = new Banco(rodri.getNumeroConta(), 500.0);
		
		//usar metodo depositar
		
		Banco realizaDeposito = new Banco();
		realizaDeposito.depositarLista(contasCriadas, listaDepositos);
	}
}