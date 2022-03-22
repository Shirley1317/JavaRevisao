
import java.util.Scanner;

public class ExecutaCadFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		String email;
		int idade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o Funcionário");
		nome = sc.nextLine();
		System.out.println("Entre com o Email");
		email = sc.nextLine();
		System.out.println("Entre com a Idade");
		idade = sc.nextInt();
		
		//Executando a chamada da classe e fazendo a passagem de parametro ao seu metodo
		ProcParametrosRecebido executar = new ProcParametrosRecebido();
		executar.mensagem(nome, email, idade);
		
		// Executando a chamada da classe com o metodo para saber o ano de nascimento
		ProcParametrosRecebido processa = new ProcParametrosRecebido();
		processa.anonasc (nome, idade);

	}

}
