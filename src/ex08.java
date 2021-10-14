import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		int num1 = input.nextInt();
		System.out.print("Digite o segundo valor: ");
		int num2 = input.nextInt();

		input.close();

		int soma = 0;
		for (int i = num1 + 1; i < num2; i++) {
			soma += i;
		}
		System.out.println(soma);

	}

}
