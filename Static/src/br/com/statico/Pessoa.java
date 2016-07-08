package br.com.statico;

public class Pessoa {
	
	
	//forma de contar quantas instancias de uma classe eu tenho
	//membros estaticos pertencem a classe e nao ao objeto
	
	public int idade;
	public static int contador;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Pessoa(){
		
		Pessoa.contador = Pessoa.contador+1;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Pessoa.contador = contador;
	}
	
	

}
