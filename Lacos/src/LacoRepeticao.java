
public class LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// criando um la�o de repeti��o com o while
		
		System.out.println("La�o de Repeti��o com while");
		
		// criando um contator em um la�o, primeiro cria uma vari�vel do tipo inteiro e insere valor
		
		int contador=0; // 0 � o valor informado para inicio do contador
		do {
			System.out.println(contador);
			// implementando o nosso contador
			contador++; // ++ sempre implementa mais um
		}
		while(contador<5);	// menor que 5, implementa at� 4
		
		
		// criando um la�o de repeti��o com for
		
		System.out.println("La�o de repeti��o com for");
		
		// criando um contator em um la�o, primeiro cria uma vari�vel do tipo inteiro e insere valor
		
		for(int cont=0; cont<5; cont++) // diferente do while pode colocar tudo na mesma linha
			System.out.println(cont);
		}
	}


