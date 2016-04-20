import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int N, i, vet[];
		
		System.out.print("Quantos valores você quer digitar? ");
		N = sc.nextInt();
		
		vet = new int[N];
		
		for (i=0; i<N; i++) {
			System.out.print("Digite o "+(i+1)+"° valor: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for (i=0; i<N; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}
}
