package Controle;

public class Mulher extends Pessoa implements Casamento{

	
	public void casar(Pessoa p) {
		System.out.println(this.getNome()+" Esta casada com " + p.getNome());
		
	}
	
	

}
