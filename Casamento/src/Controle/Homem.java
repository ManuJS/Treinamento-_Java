package Controle;

public class Homem extends Pessoa implements Casamento {
	
	public void casar(Pessoa p) {
		System.out.println("LOSE " + this.getNome()+" Esta casado com " + p.getNome());
		
	}

}
