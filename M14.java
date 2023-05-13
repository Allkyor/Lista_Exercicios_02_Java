package exercicio;
import java.util.Scanner;
public class M14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Digite um número");
		num = Integer.parseInt(ler.nextLine());	
		for(int a = num -1, b = 1; a >= 0; a--, b += 2) {
			//espaços em branco
			for(int c = 1; c<= a; c++) {
				System.out.print(" ");
			}
			//espaços com *
			for(int d =1; d <=b; d++ ) {
				System.out.print("*");
			}
			System.out.println();
		}	
		ler.close();
 }

}
