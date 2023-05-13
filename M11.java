package exercicio;
import java.util.Scanner;
public class M11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int linha, col;
		System.out.println("Digite quantas linhas");
		linha = Integer.parseInt(ler.nextLine());
		System.out.println("Digite quantas colunas");
		col = Integer.parseInt(ler.nextLine());	
		for(int a = 0; a < linha; a++){
		    for(int b = 0; b < col; b++){
		        System.out.print("*"); // colunas
		    }
		    System.out.println(); // linhas
		}
		 ler.close();
	}
}
