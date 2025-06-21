package secao13_jogoAdivinhacao;

/*
 * Objetivo: O usuário precisa acertar um número aleatório entre 1 e 100
 * 
 * 1 - Criar um número aleatório (1 a 100)
 * 2 - Pedir o palpite do usuário
 * 3 - Salvar as tentativas que foram erradas (contagem) - while até acertar
 * 4 - Enquanto o usuário não acerta, exibir se o número alvo é maior ou menor que o palpite
 * 5 - Exibir mensagem de sucesso se ele acertar, com contagem de tentativas
 * 
 */

import java.util.Scanner;
import java.util.Random;


public class jogoAdivinhacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randow = new Random();

        // Obter o numero aleatório
        int numeroSecreto = randow.nextInt(100) + 1;
        int palpite = 0;
        int tentativas = 0;

        while (palpite != numeroSecreto) {

            System.out.println("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                
                System.out.println("O número é maior que " + palpite + "! Tente novamente!");
                
            } else if(palpite > numeroSecreto) {

                System.out.println("O número é menor que " + palpite + "! Tente novamente!");

            } else {

                System.out.println("Parabéns! Você acertou o palpite!");
                System.out.println("Seu palpite: " + palpite);
                System.out.println("Número secreto: " + numeroSecreto);
                System.out.println("Você tentou " + tentativas + " vezes até acertar o palpite.");

            }

            
        }


        scanner.close();
        
    }
}
