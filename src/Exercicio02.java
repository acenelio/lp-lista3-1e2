import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		DecimalFormat df = new DecimalFormat(".000");
		df.setRoundingMode(RoundingMode.HALF_DOWN);
		
		int N, i;
		double vet[], soma, media;
		
		System.out.print("Quantos valores você vai digitar? ");
		N = sc.nextInt();
		vet = new double[N];

		// Parte 1: leitura dos dados do vetor
		for (i=0; i<N; i++) {
			System.out.print("Digite o "+(i+1)+"° valor: ");
			vet[i] = sc.nextDouble();
		}
		
		// Parte 2: impressao do vetor na tela
		System.out.println("\nValores digitados:");
		for (i=0; i<N; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();

		// Parte 3: calculo da soma e da media do vetor
		soma = 0.0;
		for (i=0; i<N; i++) {
			soma = soma + vet[i];
		}
		media = soma / N;

		System.out.println("\nSoma = " + df.format(soma));
		System.out.println("Media = " + df.format(media));
		
		sc.close();
	}
}
