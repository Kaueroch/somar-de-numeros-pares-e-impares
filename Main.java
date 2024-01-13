package quantidadedenumerosimparesepares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um numero");
		int n1 = sc.nextInt();
		System.out.println("Escreva um numero");
		int n2 = sc.nextInt();

		if (n1 % 2 == 0 && n2 % 2 == 0) {
			System.out.println(n1 + " e " + n2 + " São pares!");
		}else {System.out.println("Esse numero não é par!"); }
		System.out.println("Escreva um numero");
		int n3 = sc.nextInt();
		System.out.println("Escreva um numero");
		int n4 = sc.nextInt();

		if (n3 % 3 == 0 && n4 % 3 == 0) {
			System.out.println(n3 + " e " + n4 + " São impares!");
		}else {
			System.out.println("Esse numero não é impar!");
		}
   System.out.print("A soma entre os numeros pares é:" + (n1 + n2) + " ||" + " A soma entre os numeros impares é:" + (n3+ n4));
   sc.close();
	}
}
/*******************************************************************************
 * 31) Escrever um programa que leia um conjunto de números positivos, e exiba
 * se o número lido é par ou ímpar. Exiba ao final a soma total dos números
 * pares lidos e também a soma dos números ímpares lidos. Suporemos que o número
 * de elementos deste conjunto não é conhecido, e que um número negativo será
 * utilizado para sinalizar o fim dos dados.
 *******************************************************************************/
