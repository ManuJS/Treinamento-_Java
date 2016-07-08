package br.com.controle;

public class Vendedor extends Gerente implements Gratificacao {

	private double venda;

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	public double calculaGratificacao() {

		double gratificacao = this.venda / 30;
		return gratificacao;

	}

}
