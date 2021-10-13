import java.util.Scanner;

public class at02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Nome de usuário: ");
		String nome = input.nextLine();
		System.out.print("Senha: ");
		String senha = input.nextLine();

		while (nome.equals(senha)) {
			System.out.println("Nome de usuário igual senha, devem ser diferentes");
			System.out.print("Nome de usuário: ");
			nome = input.nextLine();
			System.out.print("Senha: ");
			senha = input.nextLine();
		}
		input.close();
	}

}
