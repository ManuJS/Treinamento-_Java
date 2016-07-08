package Controle;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa();
		p.setIdade(30);
		p.setNome("Estagiario");
		
		
		Cadastrador c = new Cadastrador();
		
		try {
			c.cadastrar(p);
		} catch (AgeAception e) {
			
			System.out.println("erro cadastrar ");
		}
		
		

	}

}
