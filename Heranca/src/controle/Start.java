package controle;

public class Start {
	
	
	public static void main(String[] args) {
		
		/*String a = "carro";
		String b = "bola";
		
		//o equals verifica se o valor de duas variaveis são iguais. caso verdadeiro retorna TRUE caso contrario FALSE.
		System.out.println(a.equals(b));*/
		
		
		Pessoa p1 = new Pessoa("Emanuelle", 24);
	//	System.out.println(p.toString());
		Pessoa p2 = new Pessoa("Emanuelle", 36);
	//	System.out.println(p.toString());
		
		System.out.println("equals " + p1.equals(p2));
		System.out.println("p2 hashcode "+p2.hashCode()  + " p1 hashcode "+p1.hashCode() );
	}

}


/*99% de tudo em java sao objetos, exceto os tipos primitivos. mas qualquer objeto encapsula esses tipos de dados. 
 * 
 */

