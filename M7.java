package exercicio;
import java.util.Scanner;
public class M7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 1, num;
		System.out.println("Digite seu número");
		num = Integer.parseInt(ler.nextLine());
		while(i <= num){
			num = num-1;
			System.out.println(num);
		}		
		ler.close();
	}

}
