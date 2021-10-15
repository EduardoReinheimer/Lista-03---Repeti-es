import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor de n: ");
		int n = input.nextInt();

		input.close();

		int numeros[] = new int[n + 2];
		numeros[0] = 0;
		numeros[1] = 1;

		for (int i = 2; i < numeros.length; i++) {
			numeros[i] = numeros[i - 1] + numeros[i - 2];
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
