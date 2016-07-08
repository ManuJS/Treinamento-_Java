package Pesquisa;

import java.util.Scanner;
/*1 - faça um programa que solicite ao usuário um numero e realize 
 * a contagem recursiva ate zero sem utilizar estrutura de repetição*/
 
public class MergeSort {

	 static Scanner rgt = new Scanner (System.in);  
	
	static int funcao (int num){
		
		int num2  = num;	
		if (num2 > 0){
			System.out.println(num2);
			num2 --;
			
			funcao (num2);
		}
		else
			return 0;
			
		return num2;
}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num;

	System.out.println("informe um numero");
	num =  rgt.nextInt();
	
	funcao(num);
	

		
	}

}
