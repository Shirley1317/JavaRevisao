import java.util.Scanner;

public class GerarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// gerar matriz com 10 registros
		
		//Criando a variável da nossa matriz sempre usa colchete onde voce restringe a quantidade de registros
		String[] nomefuncionario =  new String [5];
		
		// Criando o nosso laço de repetição for
		
		for (int contador=0; contador <4; contador++) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Entre com o funcionario " + contador + " º: ");// mensagem para informar o que deseja
			nomefuncionario[contador]=teclado.next();
			//
			//System.out.println(contador +"-"+nomefuncionario[contador]);
			
		
			
		}
		
	}

}
