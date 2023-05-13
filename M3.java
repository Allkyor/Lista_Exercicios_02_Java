package exercicio;
import java.util.Scanner;
public class M3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int altura, largura;
		System.out.println("Digite a Largura do quadrado:");
		largura = Integer.parseInt(ler.nextLine());
		System.out.println("Digite a Altura do quadrado:");
		altura = Integer.parseInt(ler.nextLine());		
		System.out.println("A área do quadrado é: "+(altura*largura));		
		ler.close();
	}

}
