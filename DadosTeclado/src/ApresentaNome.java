import java.util.Scanner;

public class ApresentaNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String produto;
		float valor, total;
		int quantidade;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println( "Entre com o produto: ");
		produto=teclado.next();
		
		System.out.println( "Entre com a quantidade do produto: ");
		quantidade=teclado.nextInt();
		
		System.out.println( " Entre com o valor do produto: ");
		valor=teclado.nextInt();
		
		total=quantidade*valor;
		System.out.println(" O produto é "+produto+ "e o seu valor de estoque é" + total);

	}

}
