package lacos;

import java.util.Scanner;

public class lacos2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n1, n2, n3;

		System.out.print("Digite o primeiro numero:   \n");

		n1 = leia.nextInt();

		System.out.print("Digite o segundo numero:   \n");

		n2 = leia.nextInt();

		System.out.print("Digite o terceiro numero:   \n");

		n3 = leia.nextInt();

		leia.close();

		if (n1 <= n2 && n2 <= n3) {
			System.out.printf("numero1: " + n1 + " numero2: " + n2 + " numero3: " + n3);
		} else if (n1 <= n3 && n3 <= n2) {

			System.out.printf("numero1: " + n1 + " numero3: " + n3 + " numero2: " + n2);
		} else if (n2 <= n1 && n1 <= n3) {

			System.out.printf("numero2: " + n2 + " numero1: " + n1 + " numero3: " + n3);
		} else if (n2 <= n3 && n3 <= n1) {

			System.out.printf("numero2: " + n2 + " numero3: " + n3 + " numero1: " + n1);
		} else if (n3 <= n1 && n1 <= n2) {

			System.out.printf("numero3: " + n3 + " numero1: " + n1 + " numero2: " + n2);
		} else if (n3 <= n2 && n2 < n1) {
			System.out.printf("numero3: " + n3 + " numero2: " + n2 + " numero1: " + n1);
		}

	}

}
