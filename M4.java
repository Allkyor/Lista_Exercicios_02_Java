package exercicio;
import java.util.Scanner;
public class M4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, media;
		System.out.println("Digite a primeira nota.");
		nota1 = ler.nextFloat();
		System.out.println("Digite sua segunda nota");
		nota2 = ler.nextFloat();
		media = (nota1 + nota2)/2;
		System.out.println("Sua primeira nota foi: "+nota1+" \nSua segunda nota foi: "+nota2);
		System.out.println("Sua média foi de "+media);
		ler.close();
	}

}
