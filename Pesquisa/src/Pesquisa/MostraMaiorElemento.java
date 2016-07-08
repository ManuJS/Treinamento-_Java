package Pesquisa;

import java.util.Scanner;

public class MostraMaiorElemento {
	
	 static Scanner rgt = new Scanner (System.in);  
	 
	public static void main(String[] args) {
		
		int i, n, maior = 0; 
		int[] v = new int[10];	
		
		for (i = 0; i <10; i++){
						
			System.out.println("Informe um numero");
			v[i] = rgt.nextInt();
		}
		
		for (i = 0; i <10; i++){
			if (v[i]> maior){
				maior = v[i];
			}
			
		}
		
		System.out.println("maior = " + maior);

	}

}
