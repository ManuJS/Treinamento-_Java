package controle;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LeituraThread

{

	public static String getDateTime() {

		DateFormat dt = new SimpleDateFormat("HH:mm:ss:ms");
		Date date = new Date();

		return dt.format(date);
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		
		long tempoInicial = 0;
		long tempoFinal = 0;
		int posicoesArray = 20000;

		ArrayList<String> Pedidos = new ArrayList<String>();

		String n  = " ";
		String log = " ";
		tempoInicial = System.currentTimeMillis();

		for (int i = 1; i < posicoesArray + 1; i++) {

			n = "\r\nPedido numero: " + i + " \r\n" + "Descrição do Pedido: " + i
					+ " \r\n";
			Pedidos.add(n);

			System.out.println("\r\n" + n + "Pertence a " 
					+ Thread.currentThread()+ "\r\n");

			System.out.println("-------------------------------");
			String h = getDateTime();
			log = log + n + "processado pela Thread: "
					+ Thread.currentThread() + "\r\n" + "Alterado as: " + h +"\r\n";

		}
		
			Thread.sleep(100);
		
			
		
						
		tempoFinal = System.currentTimeMillis();
		log = log + "\r\n" + "tempo de processamento: "
				+ (tempoFinal - tempoInicial + " milisegundos");

	
			FileWriter arq = new FileWriter(
					"D:\\cursoJavaBasicoUCP\\eclipse32Bits\\workspace\\TesteThread\\dados.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.printf(log);
			
			arq.close();
		
	}

}