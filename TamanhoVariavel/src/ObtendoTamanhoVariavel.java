import java.util.Scanner;

public class ObtendoTamanhoVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String senha;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Entre com a senha: ");
		senha=teclado.next();
		System.out.println("A quantidade de digitos da senha é " + senha.length());
		
		if (senha.length() <=4) {
			System.out.println(" Quantidade de digitos invalida, a senha deve conter 6 digitos");
			
			
		}else if(senha.equals("gama@2022")) {
			System.out.println("Senha correta");
		}else {
			System.out.println("Senha inválida");
			
			
		}

	}

}
