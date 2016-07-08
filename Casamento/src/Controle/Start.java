package Controle;

public class Start {

	
	public static void main( String args[]) {
		
		Homem h = new Homem();
		Mulher m = new Mulher();
		
		h.setNome("Fernando");
		h.setIdade(20);
		
		m.setNome("Maria");
		m.setIdade(18);
		
		h.casar(m);
		m.casar(h);
		
	}
}
