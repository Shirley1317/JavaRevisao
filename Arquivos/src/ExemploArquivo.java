import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExemploArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String[] nomes = {"Marcos","Pedro","Rog�rio","Regina"};
		
		FileWriter arquivo = new FileWriter("C:\\Users\\estev\\funcionarios.txt");//cria um arquivo na unidade que escolhemos
		PrintWriter gravarArquivo = new PrintWriter(arquivo); // envia informa��es para dentro do arquivo
		
		gravarArquivo.printf("Registro dos Funcion�rios");
		gravarArquivo.printf("Nome funcion�rios" + "%n");
		for(int contador=0; contador<4; contador++) {
			gravarArquivo.printf(nomes[contador]+ "%n");
		}
	
		arquivo.close();
		System.out.println("O arquivo est� sendo gravado na unidade C:\\Users\\estev\\funcionarios.txt");
	
	}
	
}
		