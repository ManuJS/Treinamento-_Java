package controle;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GravarTexto extends Thread {

	public static void gravaTexto() throws IOException, InterruptedException {

		Scanner ler = new Scanner(System.in);

		int i = 0;
		String n;

		ArrayList<String> dados = new ArrayList<String>();

		do {// preenche o array

			i++;
			System.out.println("informe um nome \n");
			n = ler.next();
			dados.add(n);

		} while (i < 5);

		FileWriter arq = new FileWriter(
				"D:\\Documents and Settings\\p804383\\Desktop\\dados.txt");
		// o caminho do arquivo tem que estar como foi escrito no paramentor do
		// FileWriter.
		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.printf("+--Resultado--+%n");

		String h = getDateTime();

		for (String s : dados) {
			// gravarArq.printf(" %s", h );
			gravarArq.printf("\r\n %s %s ", h, s);
			// Thread.sleep(1000);

		}

		gravarArq.printf("\r\n+-------------+%n");
		arq.close();

		System.out.printf("\n nomes ");

	}

	public static String getDateTime() {

		DateFormat dt = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();

		return dt.format(date);
	}

	public static void main(String args[]) throws IOException,
			InterruptedException {

		gravaTexto();

	}

}
