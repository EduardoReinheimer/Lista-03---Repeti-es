import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = input.nextInt();

		input.close();

		System.out.println(String.format("===== Tabuada de %s =====", num));
		for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
			System.out.println(String.format("%s x %s =  %s", num, multiplicador, num * multiplicador));
		}

	}

}
