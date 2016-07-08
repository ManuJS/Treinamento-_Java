package controle;

public class OlaThread extends Thread{
	
	public void run(){
		System.out.println("Ola Thread");
		
	}
	

	public static void main(String[] args) {
		new OlaThread().start();

	}

}
