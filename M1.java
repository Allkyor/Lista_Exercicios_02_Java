package exercicio;
import java.util.Scanner;
public class M1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		System.out.println("Olá usuario! digite seu nome.");
		nome = ler.nextLine();
		
		System.out.println("Olá "+nome+", prazer em te conhecer!");
		ler.close();
	}

}
