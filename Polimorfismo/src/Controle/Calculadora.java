package Controle;

public class Calculadora {

	public double calcular(double a, double b, char c) {
		double resultado = 0.0;

		switch (c) {

		case '+':
			resultado = a + b;
			break;

		case '-':
			resultado = a - b;
			break;

		case '*':
			resultado = a * b;
			break;

		case '/':
			resultado = a / b;
			break;
		}

		return resultado;
	}

}
