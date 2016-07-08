package controle;

//objetos herdados da classe Object
public class Pessoa {

	private String nome;
	private Integer idade; //uso integer pra utilizar os metodos da classe object.

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() { //retorna o identificador do objeto. se os dois objetos forem iguais, ele tem que retornar numeros iguais. 
		
		return this.idade*7 ;
	}	
	
	
	
	
	
	
	@Override
	// se esse objeto for uma instancia de pessoa, ele cria uma novo pessoa e
	// guarda na variavel p;
	// se esse objeto nao for uma instancia de pessoa ele retorna falso
	public boolean equals(Object obj) {
		if (obj instanceof Pessoa) {
			Pessoa p = (Pessoa) obj;

			if (this.nome.equals(p.getNome())&& this.idade.equals(p.getIdade())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;

		}

	}

	// método para retornar no main o valor da variavel e nao o endereço de
	// memoria.

	@Override
	public String toString() {
		return this.nome + " " + this.idade;
	}

}
