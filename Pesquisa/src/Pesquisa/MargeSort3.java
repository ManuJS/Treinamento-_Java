package Pesquisa;

import java.util.Scanner;

public class MargeSort3 {
	/*faça um programa que preenche m vetor de 50 elementos inteiros, 
	 * em seguida solicite um numero ao usuario. ao termino, o programa devera
	 * exibir a mensagem "achou o numero" caso o numero existir ou "não achou o numero"
	 * caso ele exista.
	 */

	 static Scanner rgt = new Scanner (System.in);  
		
		
	/* static void preenche(){
		 
		 int [] v  = new int [50];
		 int n;
		 
		 for (n = 0; n < 50; n++)
		
		 System.out.println("informe um numero");
		 v[n] = rgt.nextInt();
		 	 
	 }*/
	 
	 static void funcao (int num, int aux){
			
			int num2 = num;	
			if (num2 > 1){
				aux = num2 * aux;
				num2 --;
				 					
				funcao (num2, aux);
				
			}
			else
			
			
			System.out.println(" "+ aux);
	}
		 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		/*int num, aux = 1;

		System.out.println("informe um numero");
		num =  rgt.nextInt();*/
		
			int i, n, maior = 0; 
			int[] v = new int[50];	
			
			for (i = 0; i <10; i++){
							
				System.out.println("Informe um numero");
				v[i] = rgt.nextInt();
			}
		}

	}