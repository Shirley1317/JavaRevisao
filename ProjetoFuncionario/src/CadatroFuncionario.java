
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadatroFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String nome_Funcionario, email_Funcionario;
		int nome_arq = 0;
		int mostra;
		double idade_Funcionario;
		
		
		
		
		System.out.println("Entre com o nome do Funcionário: ");
		nome_Funcionario=teclado.next();
		
		System.out.println("Entre com o email: ");
		email_Funcionario=teclado.next();
		
		System.out.println("Entre com a idade: ");
		idade_Funcionario=teclado.nextDouble();
		
		try {
			File arq = new File ("C:\\Users\\estev\\funcionarios.txt");
			FileWriter writer = new FileWriter (new File(nome_arq + ".txt"));
			PrintWriter cadastro = new PrintWriter(writer);
			cadastro.println("Cliente: " + nome_Funcionario+ "\r\r\n" + "Email: " + email_Funcionario + "Idade: " + idade_Funcionario + "\r\r\n)");
			cadastro.close();
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		mostra = JOptionPane.showConfirmDialog(null,  "Novo cadastro?");
			if (mostra ==JOptionPane.NO_OPTION)
				JOptionPane.showMessageDialog(null, "Encerrar cadastro");
			if (mostra == JOptionPane.YES_OPTION) {
				
			}else {
				System.exit(0);
			}
			System.exit(0);
	}
				
		
		
		
		

	}


