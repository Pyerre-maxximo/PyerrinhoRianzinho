package Exe01;

import java.util.Scanner;

public class Exe04 {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        
	        long produto = 1;

	        for (int i = 1; i <= numero; i += 2) {
	            produto *= i;
	        }

	        System.out.println("O produto dos números ímpares entre 1 e " + numero + " é: " + produto);
	        
	        scanner.close();
	    }
	}