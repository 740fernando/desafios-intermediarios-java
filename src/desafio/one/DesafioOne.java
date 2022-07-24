package desafio.one;

import java.util.Scanner;

public class DesafioOne {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int cont = 0;
		int soma = 0;
		int n = leitor.nextInt();

//TODO: Complete os espaços em branco com uma possível solução para o desafio

		while (n >= 1) {
			if (n >= 0) {
				soma += n;
				cont++;
			}
			n = leitor.nextInt();
		}
		double media = (double)soma / cont;
		System.out.println(String.format("%.2f", media));
	}

}
