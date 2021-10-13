
public class ex05 {

	public static void main(String[] args) {
		for (int i = 1; i < 21; i++) {
			System.out.print(String.format("%s%s", i, i != 20 ? " - " : "."));
		}

	}

}
