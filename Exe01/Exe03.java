//Crie um programa que soma todos os números pares entre 1 e o número fornecido pelo usuario
package Exe01;

import java.util.Scanner;

public class Exe03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		int soma = 0;
		
		System.out.print("Escolha um número: ");
		valor =  scanner.nextInt();
		
		for (int i = 1; i <= valor; i++) {
			
			if(i % 2 == 0) {
				 soma += i;
			}
		}
		
		System.out.print("A soma de numeros pares entre 1 e " + valor + " é de: " + soma);
	}
}