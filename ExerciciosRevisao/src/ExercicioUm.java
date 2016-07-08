


public class ExercicioUm {
	
	  static Scanner rgt = new Scanner (System.in);  
	  static Random gerador = new Random(); 
	
	  
		public static void preenche(){

		 
		 int vet[] = new int[10];
		 int i, x;
		 
		 for (i = 0; i < 10; i++){
			
			 x = gerador.nextInt(100);
			vet[i] = x;
			 
		 }
	
	 }
	
		public static void busca(int x, int vet[]){
			
			 int n = x, i;
					
			 System.out.println("informe um numero");
			
			 n = rgt.nextInt();
			
	
			 for (i = 0; i <10; i++){
					 
				if (n == vet[i]){
					System.out.println("achou");
				}else{
						System.out.println("nao achou");
		   		}
			 }
		}
	  		  public static void main(String[] args) {
	  			
	  			  int n = 0;
	  			  
	  			  preenche();
	  			  busca (n, null);
	  				  			  


	}
}


