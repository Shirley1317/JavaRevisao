
public class LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// criando um laço de repetição com o while
		
		System.out.println("Laço de Repetição com while");
		
		// criando um contator em um laço, primeiro cria uma variável do tipo inteiro e insere valor
		
		int contador=0; // 0 é o valor informado para inicio do contador
		do {
			System.out.println(contador);
			// implementando o nosso contador
			contador++; // ++ sempre implementa mais um
		}
		while(contador<5);	// menor que 5, implementa até 4
		
		
		// criando um laço de repetição com for
		
		System.out.println("Laço de repetição com for");
		
		// criando um contator em um laço, primeiro cria uma variável do tipo inteiro e insere valor
		
		for(int cont=0; cont<5; cont++) // diferente do while pode colocar tudo na mesma linha
			System.out.println(cont);
		}
	}


