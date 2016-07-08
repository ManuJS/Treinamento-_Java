package br.com.controle;

public class Start {

	public static void main(String[] args) {

		Vendedor v = new Vendedor();
		v.setVenda(8000.00);

		GerenteGeral gg = new GerenteGeral();
		gg.setSalario(3000.00);

		GerenteVendas gv = new GerenteVendas();
		gv.setSalario(2500.00);

		RH rh = new RH();
		rh.calculaPagamento(v);
		rh.calculaPagamento(gg);
		rh.calculaPagamento(gv);

	}

}
