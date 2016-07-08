package Controle;

public class Cadastrador {
	
	public void cadastrar (Pessoa p) throws AgeAception{
		if (p.getIdade() < 18) {
			throw new AgeAception();
		
		}else {
			System.out.println("cadastro realizado ");
		}
		
	}
	

}
