
public class ProcParametrosRecebido {
	// criando um metodo dentro desta classe
	
	public void mensagem (String nome, String email, int idade) { // declarando os parametros que irei receber na outra classe
		System.out.println("O nome do funcion?rio ? " +nome+", contem a idade, " +idade+ " e o email fornecido ? " + email);
	
	}
	
	public void anonasc (String nome, int idade) {
		System.out.println("O nome do funcion?rio ? " +nome+ "e ele nasceu no ano de " +(idade - 2022));
	}
	

}
