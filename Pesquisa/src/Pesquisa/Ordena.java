package Pesquisa;

public class Ordena {
	
	public static void main(String args[]){
		int vet[] = {5, 7, 2, 3, 6, 9, 8}, i, j, min, aux;
		
		for(i = 0; i < 7; i++){
			min = i;
			for(j = i + 1; j < 7; j++){
				if(vet[j] < vet[min]){
					min = j;
				}
			}
			aux = vet[min];
			vet[min] = vet[i];
			vet[i] = aux;
		}
		for(i = 0; i < 7; i++)
			System.out.print(" " + vet[i]);
	}

}
