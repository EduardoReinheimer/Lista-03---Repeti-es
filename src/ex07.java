import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		int num1 = input.nextInt();
		System.out.print("Digite o segundo valor: ");
		int num2 = input.nextInt();

		input.close();

		for (int i = num1 + 1; i < num2; i++) {
			System.out.println(i);
		}

	}

}
