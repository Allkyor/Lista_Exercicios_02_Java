package exercicio;
import java.util.Scanner;
public class M10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1;
		System.out.println("Digite um número");
		num1 = Integer.parseInt(ler.nextLine());
		 for (int i = 1; i <= num1; i++){
			 System.out.println("*");
		}	
		ler.close();	
	
	}

}
