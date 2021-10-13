import java.util.Scanner;

public class ex01 {
	static final String DEFAULT_INPUT_MESSAGE = "Digite uma nota entre 0 e 10: ";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(DEFAULT_INPUT_MESSAGE);
		float nota = input.nextFloat();

		while (nota < 0 || nota > 10) {
			System.out.print(DEFAULT_INPUT_MESSAGE);
			nota = input.nextFloat();
		}
		input.close();

	}

}
