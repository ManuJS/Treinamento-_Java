package controle;

//import controle.ImprimirThread_1;


public class TesteConcorrente{
	
	public static void main(String args[]){
		
			
		new Thread(new ImprimirThread_1("Thread A")).start();
		new Thread(new ImprimirThread_1("Thread B")).start();
	}
}
