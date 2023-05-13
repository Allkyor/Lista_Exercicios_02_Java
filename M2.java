package exercicio;
import java.util.Scanner;
public class M2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;
		System.out.println("Olá usuario! Digite seu nome:");
		nome = ler.nextLine();
		System.out.println("Agora digite sua idade!");
		idade = Integer.parseInt(ler.nextLine());
		
		System.out.println("Seu nome é: "+nome+" e sua idade é: "+idade);
		ler.close();
	}

}
