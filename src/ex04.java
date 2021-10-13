import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a popula��o do pa�s A: ");
		double populacaoPaisA = input.nextDouble();
		System.out.print("Digite a popula��o do pa�s B: ");
		double populacaoPaisB = input.nextDouble();

		while (populacaoPaisA > populacaoPaisB) {
			System.out.println("A popula��o do pa�s B deve ser maior");
			System.out.print("Digite a popula��o do pa�s A: ");
			populacaoPaisA = input.nextDouble();
			System.out.print("Digite a popula��o do pa�s B: ");
			populacaoPaisB = input.nextDouble();
		}

		System.out.print("Digite a taxa de crescimento do pa�s A: ");
		double taxaCrescimentoPaisA = input.nextDouble();
		System.out.print("Digite a taxa de crescimento do pa�s B: ");
		double taxaCrescimentoPaisB = input.nextDouble();

		while (taxaCrescimentoPaisA < taxaCrescimentoPaisB) {
			System.out.println("A taxa de crescimento do pa�s A deve ser maior");
			System.out.print("Digite a taxa de crescimento do pa�s A: ");
			taxaCrescimentoPaisA = input.nextDouble();
			System.out.println("Digite a taxa de crescimento do pa�s B: ");
			taxaCrescimentoPaisB = input.nextDouble();
		}

		input.close();
		
		int countAnos = 0;
		while (populacaoPaisA < populacaoPaisB) {
			populacaoPaisA = GetValuePlusPerrcentage(populacaoPaisA, taxaCrescimentoPaisA);
			populacaoPaisB = GetValuePlusPerrcentage(populacaoPaisB, taxaCrescimentoPaisB);
			countAnos++;
		}

		System.out.println(String.format("A ultrapassa ou se igual a B em %s anos", countAnos));

	}

	private static double GetValuePlusPerrcentage(double value, double percentual) {
		return value + ((value / 100) * percentual);
	}

}
