package br.com.controle;

public class GerenteVendas extends Gerente implements Gratificacao{

	@Override
	public double calculaGratificacao() {
		
		double gratificacao = 50.00;
		return gratificacao;
	}

}
