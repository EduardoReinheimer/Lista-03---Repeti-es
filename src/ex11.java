import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int index = 0; index < numeros.length; index++) {
			System.out.print(String.format("Digite o número %s: ", index + 1));
			numeros[index] = input.nextInt();
		}

		input.close();

		int countPares = 0;
		int countImpares = 0;

		for (int index = 0; index < numeros.length; index++) {
			if (EhPar(numeros[index])) {
				countPares++;
			} else {
				countImpares++;
			}
		}

		System.out.println("Pares: " + countPares);
		System.out.println("Ímpares: " + countImpares);
	}

	private static boolean EhPar(int value) {
		return value % 2 == 0;
	}

}
