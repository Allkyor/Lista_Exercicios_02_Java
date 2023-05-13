package exercicio;
import java.util.Scanner;
public class M13F {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Digite um número");
		num = Integer.parseInt(ler.nextLine());
		for(int a = 1; a <= num; a++) {
			for(int b = 1; b <=num; b++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		ler.close();
	}

}
