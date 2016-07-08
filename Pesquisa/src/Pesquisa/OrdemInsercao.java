package Pesquisa;

public class OrdemInsercao {
	
	public static void main(String args[]){
		int vet[] = {5, 7, 9, 2, 6, 11}, i, j, eleito;
		
		for(i = 1; i < 6; i++){
			eleito = vet[i];
			j= i -1;
			
			while((j>=0) && (eleito < vet[j])){
				vet[j+1] = vet [j];
				j--;
			}
			vet[j+1] = eleito;
			
		}	
			
			for(i = 0; i<6; i++){
				System.out.println(vet[i]);
		
				}
			}
}
