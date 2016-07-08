package Pesquisa;

public class mostraMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAM = 5;
		int vet[];
		mostraMaior mM = new mostraMaior();
		vet = mM.preencheVetor();
		
		System.out.println(vet[vet.length - 1]); 
	}
	
	public int[] preencheVetor(){
		int vet[] = {52, 36, 12, 108, 90};
		vet = this.ordenaVetor(vet);
		return vet;
	}
	
	public int[] ordenaVetor(int vet[]){
		int i, j, min, aux;
		
		for(i = 0; i < vet.length - 1; i++){
			min = i;
			
			for(j = i + 1; j < vet.length; j++)
				if(vet[j] < vet[min])
					min = j;
			
			if(min != i){
				aux = vet[min];
				vet[min] = vet[i];
				vet[i] = aux;
			}
		}
		
		return vet;
	}

}
