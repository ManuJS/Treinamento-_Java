package Pesquisa;


	import java.util.Scanner;
	/*2 - faça um programa que receba um numero e informe o 
	 * fatorial desse numero sem utilizar estrutura de repetição.
	 */
	 
	public class MargeSort2 {

		 static Scanner rgt = new Scanner (System.in);  
			
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
				
			int num, aux = 1;

			System.out.println("informe um numero");
			num =  rgt.nextInt();
			
			funcao(num, aux);
			
			

				
			}

		}




