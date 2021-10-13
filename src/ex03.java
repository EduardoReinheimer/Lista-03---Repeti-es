import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um nome: ");
		String nome = input.nextLine();

		while (nome.length() < 3) {
			System.out.println("Nome deve ter mais de 3 caracteres.");
			System.out.print("Digite um nome: ");
			nome = input.nextLine();
		}

		System.out.print("Digite a idade: ");
		int idade = input.nextInt();

		while (idade < 0 || idade > 150) {
			System.out.println("Valor inválido, digite uma idade entre 0 e 150.");
			System.out.print("Digite a idade: ");
			idade = input.nextInt();
		}

		System.out.print("Digite o salário: ");
		float salario = input.nextFloat();

		while (salario <= 0) {
			System.out.println("O salário deve ser maior que 0.");
			System.out.print("Digite o salário: ");
			salario = input.nextFloat();
		}

		System.out.print("Digite o caracter correspondente ao sexo: ");
		char sexo = input.next().charAt(0);

		while (sexo != 'm' && sexo != 'f') {
			System.out.println("O caracter correspondete ao sexo deve ser m ou f");
			System.out.print("Digite o caracter correspondente ao sexo: ");
			sexo = input.next().charAt(0);
		}

		System.out.println("Digite o caracter correspondente ao estado civil: ");
		char estadoCivil = input.next().charAt(0);

		while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
			System.out.println("O caracter correspondete ao sexo deve ser s, c, v ou d");
			System.out.println("Digite o caracter correspondente ao estado civil: ");
			estadoCivil = input.next().charAt(0);
		}
		input.close();

	}

}
