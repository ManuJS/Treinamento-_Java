package Pesquisa;

import java.util.Scanner;
/*1- escreva um algoritmo que leia 10 numeros e  os imprima em ordem crescente*/

public class Ordena1 {

	  static Scanner rgt = new Scanner (System.in);  
	  
	/*	static void leitura(int v []){
		
		int i;
		for (i = 0;i<10; i++){
			System.out.println("informe um numero");
			v[i] = rgt.nextInt();
		}
		
		}*/

		/*static void ordena(int v[]){
			
			int [] vet = new int[10];
			int i, j, eleito;
			
			for(i = 1; i < 10; i++){
				eleito = vet[i];
				j= i -1;
				
				while((j>=0) && (eleito < vet[j])){
					vet[j+1] = vet [j];
					j--;
				}
				vet[j+1] = eleito;
				
			}	
			 
			
					}*/
				

/*static int exibe(int v[]){	
	int i;
System.out.println("numeros ordenados");
for(i = 0; i<10; i++){
	System.out.println(v[i]);
	
}
return i;}*/

		public static void main (String [] args){
			
			int[] v = new int[10];	
			int i, j, eleito;
			
			
			for (i = 0;i<10; i++){
				System.out.println("informe um numero");
				v[i] = rgt.nextInt();
			}
			
					
			for(i = 1; i < 10; i++){
				eleito = v[i];
				j= i -1;
				
				while((j>=0) && (eleito < v[j])){
					v[j+1] = v [j];
					j--;
				}
				v[j+1] = eleito;
				
			}	
			
			System.out.println("numeros ordenados");
			for(i = 0; i<10; i++){
				System.out.println(v[i]);
			
			
		}
		
	}}
