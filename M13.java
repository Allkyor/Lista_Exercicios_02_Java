package exercicio;
import java.util.Scanner;
public class M13 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int num, a,b;
			System.out.println("Digite um número");
			num = Integer.parseInt(ler.nextLine());
			
			for(a = 1; a <= num; a++) {
				for(b = num - a; b>= 1; b--)
					System.out.print(" ");
				for(b = 1; b <= a; b++) {
					System.out.print("*");
				}
				System.out.println();
			}		
			ler.close();
		}

}
