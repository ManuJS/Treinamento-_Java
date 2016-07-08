package br.com.testejar.controle;

import Controle.Calc;
import Controle.Soma;

public class Start {

	public static void main(String args[]) {
	
		Calc c = new Soma();
		double res = c.Calculador(2.0, 3.0);
		System.out.println(res);
		
		
	}
}
