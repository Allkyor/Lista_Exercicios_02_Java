package exercicio;
import java.util.Scanner;
public class M8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int  num1, num2;
		System.out.println("Digite um número");
		num1 = Integer.parseInt(ler.nextLine());
		System.out.println("Digite outro número");
		num2 = Integer.parseInt(ler.nextLine());				
		if (num1 >= num2){
			while(num1 >= num2) {
				System.out.println(num2++);			
			}	
		} else {
			while(num2 >= num1) {
				System.out.println(num1++);				
			}
		}
		
		ler.close();
	}

}
