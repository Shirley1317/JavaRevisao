import java.util.Scanner;


public class ExecutaCalculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // criar um sistema de c�lculo 
		// inserir dois valores, um menu de op��es com switch case, dentro de um loop de repeti��o
		//se o usu�rio digitar alguma op��o inv�lida, mostrar a mensagem na tela e montar novamente o menu.
		
		// criando as variaveis
		
		
		//Pegando as informa��es do teclado
		Scanner teclado = new Scanner(System.in);
		double num1, num2;
		int opcao; // onde sera armazenado a operacao desejada
		
		do {
			
			System.out.println("=======================");
			System.out.println("Digite a op��o desejada: ");
			System.out.println("1 - somar");
			System.out.println("2 - subtrair");
			System.out.println("3 - multiplicar");
			System.out.println("4 - dividir");
			System.out.println("5 - sair");
			System.out.println("=========================");
			opcao = teclado.nextInt();
					
			
			if (opcao==5) {						
				
			} else {
				
			}
						
		
			switch (opcao) {
									
			case 1: 
				System.out.println("Entre com o Primeiro valor: ");
				num1 = teclado.nextDouble();
				System.out.println("Entre com o Segundo valor: ");
				num2 = teclado.nextDouble();
				System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
				 
				 opcao = 6;
				 break;
			
			case 2: 
				System.out.println("Entre com o Primeiro valor: ");
				num1 = teclado.nextDouble();
				System.out.println("Entre com o Segundo valor: ");
				num2 = teclado.nextDouble();
				System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
				 opcao = 6;
				break;
			
			case 3: 
				System.out.println("Entre com o Primeiro valor: ");
				num1 = teclado.nextDouble();
				System.out.println("Entre com o Segundo valor: ");
				num2 = teclado.nextDouble();
				System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 * num2);
				 opcao = 6;
				break;
			
			case 4:
				System.out.println("Entre com o Primeiro valor: ");
				num1 = teclado.nextDouble();
				System.out.println("Entre com o Segundo valor: ");
				num2 = teclado.nextDouble();
				System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1 / num2);
				 opcao = 6;
				break;
			
			case 5: 
				System.out.printf("Sair");
				
				break;
				
				default:
					System.out.println(" Op��o inv�lida ");
			
			}
		}
		while (opcao < 5 || opcao == 0 || opcao > 5);
		
	}
}