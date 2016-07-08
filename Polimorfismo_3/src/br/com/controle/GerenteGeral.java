package br.com.controle;

public class GerenteGeral extends Gerente implements Gratificacao{

	@Override
	public double calculaGratificacao() {
		
		double gratificacao = this.getSalario()/10;
		return gratificacao;
	}

}
