package Controle;

public class Start {

	public static void main (String args[]){
		
		Calc c = new Divisao();
		
		
		c = new Soma();
		System.out.println("Resultado: " + c.Calculador(6.0,2.0));
	}
}
