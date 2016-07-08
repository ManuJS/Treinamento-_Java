package Pesquisa;

import java.util.Scanner;



public class Pesquisa {
    static Scanner rgt = new Scanner (System.in);  
	
   	public static void main(String[] args) {
   		
   		int i, n; 
   		int[] v = new int[10];	
   		
   		for (i = 0; i <10; i++){
   						
   			System.out.println("Informe um numero");
   			v[i] = rgt.nextInt();
   		}
   		
   		System.out.println("Selecione um numero para ser buscado");
   		n = rgt.nextInt();
   		
   		for (i = 0; i <10; i++){
   			if (n== v[i]){
   				System.out.println("achou o numero ");
   			}else
   					System.out.println("nao achou o numero ");
   			}
   			
   		}
   		
   		
   		

   	}


