package controle;

import java.util.Scanner;

public class ParImparPrimo {

	static Scanner ler = new Scanner(System.in);

	public static int verificaParImpar(int n) {

		if ((n % 2) == 0) {

			System.out.println("numero par");

		} else {

			System.out.println("numero impar");

		}

		return n;

	}

	public static void verificaPrimo(int n) {

		int teste = 0;
		int i;

		for (i = 2; i < n; i++)

			if (n % i == 0)
				
				teste = 1;

		if (teste != 0) {

			System.out.println(" n�o � n�mero primo");

		} else {
		
			System.out.println(" � um n�mero primo ");
		
		}

	}

	public static void main(String[] args) {

		int n;

		System.out.println("informe um nome e um numero");

		n = ler.nextInt();

		verificaParImpar(n);

		verificaPrimo(n);

	}

}