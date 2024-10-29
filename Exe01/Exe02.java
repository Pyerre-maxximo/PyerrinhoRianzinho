package Exe01;

import java.util.Scanner;

public class Exe02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Primeira pessoa escolhe um número entre 1 e 100
        System.out.print("Escolha um número entre 1 e 100: ");
        int numeroEscolhido = scanner.nextInt();
        
        // Verifica se o número está no intervalo correto
        if (numeroEscolhido < 1 || numeroEscolhido > 100) {
            System.out.println("Número fora do intervalo! Escolha um número entre 1 e 100.");
            return;
        }

        // Limita as tentativas
        int tentativasRestantes = 7;
        boolean acertou = false;

        System.out.println("Outro jogador, tente adivinhar o número!");

        // Loop das tentativas
        while (tentativasRestantes > 0) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroEscolhido) {
                acertou = true;
                break;
            } else if (palpite < numeroEscolhido) {
                System.out.println("O número é maior!");
            } else {
                System.out.println("O número é menor!");
            }

            tentativasRestantes--;
            System.out.println("Tentativas restantes: " + tentativasRestantes);
        }

        // Resultado final
        if (acertou) {
            System.out.println("Parabéns! Você acertou o número.");
        } else {
            System.out.println("Suas tentativas acabaram! O número era: " + numeroEscolhido);
        }

        scanner.close();
    }
}

