package lacos;

import java.util.Scanner;

public class lacos3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com sua idade: ");
		int idade = leia.nextInt();

		leia.close();

		if (idade <= 10) {
			System.out.printf("Você se enquadra na faixa de idade Infantil ");
		} else if (idade >= 15 && idade <= 17) {
			System.out.printf("Você se enquadra na faixa de idade Juvenil ");
		} else if (idade >= 18 && idade <= 25) {
			System.out.printf("Você se enquadra na faixa de idade Adulto ");
		}

	}

}
