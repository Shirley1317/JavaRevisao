import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) throws IOException {	
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int i, n;
		
		System.out.println(" Informe o número para a tabuada: \n ");
		n = ler.nextInt();
		
		FileWriter arq = new FileWriter("c:\\Users\\estev\\tabuada.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		gravarArq.printf("+--Resultado--+%n");
		for (i=1; i<=10; i++) {
			gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
		}
		gravarArq.printf("+-------------+%n");
		
		arq.close();
		
		System.out.printf("\n Tabuada do %d foi gravada com sucesso em \" c: \\Users\\estev\\tabuada.txt\".\n", n);

	}

}
