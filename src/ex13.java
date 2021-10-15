import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número a ser calculado o fatorial: ");
		int num = input.nextInt();
		
		input.close();
		
		int fatorial = 1;
		for (int i = num; i > 0; i--) {
			fatorial *= i;
		}
		
		System.out.println("O fatorial de " + num + " é " + fatorial);

	}

}
