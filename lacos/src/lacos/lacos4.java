package lacos;

import java.util.Scanner;

public class lacos4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int resultado;
		System.out.println("Entre com sua idade: ");
		int numero = leia.nextInt();

		leia.close();

		resultado = numero % 2;
		if (resultado == 0) {

			System.out.printf("O numero e par e sua raiz equivale a " + Math.sqrt(numero));
		}

		else {
			int quadrado = numero * numero;
			System.out.printf("O numero e impar e ele elevado ao quadrado equivale a " + quadrado);
		}

	}

}
