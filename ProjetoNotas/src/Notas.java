import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Nome;
		double nota1, nota2, media;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Entre com o nome do aluno: ");
		Nome = teclado.next();
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = teclado.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2)/2;
		System.out.println(" O nome do aluno � " + Nome + " e obteve a media " + media);
		

	}

}
