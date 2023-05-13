package exercicio;
import java.util.Scanner;
public class M12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, a, b;
		System.out.println("Digite um número");
		num = Integer.parseInt(ler.nextLine());
		a = 1;
		while (a <= num) {
			b = 1;
			while(b<=a) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a++;
		}

		ler.close();
	}

}
