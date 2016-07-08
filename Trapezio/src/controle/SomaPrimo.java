package controle;

 
public class SomaPrimo {



public static void main(String args[]) {
    System.out.println("Numeros primos entre 1 e 100");
    System.out.println("----------------------------");
 
    int i;
 
    for (int n=1; n<=123; n++) {
 
      boolean ehPrimo = true;
 
      i = 2;
      
      while ((ehPrimo == true) && (i <= (n / 2))) {
        if ((n % i) == 0)
           ehPrimo = false;   // encontrou um divisor, portanto, não eh primo
        else i++;             // próximo divisor utilizando operador de
                              // autoincremento (i++)
      }
 
      if (ehPrimo == true)
         System.out.printf(" " + n);
    }
    System.out.println();
  }
}