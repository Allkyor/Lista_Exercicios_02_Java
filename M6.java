package exercicio;
import java.util.Scanner;
public class M6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int  num;
		System.out.println("Digite seu número");
		num = Integer.parseInt(ler.nextLine());
		for(int i= 0; i <= num; i++) {
			System.out.println(i);	
		}		
		ler.close();		
	}

}
