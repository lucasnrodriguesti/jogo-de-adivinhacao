import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int numeroTentativas = 0;

        /*
        int contador = 5;
        int i;

         System.out.println("Tente adivinhar o número de 0 a 100 com apenas 5 tentativas ");

        for (i = 0; i < numeroTentativas; i++) {
            System.out.println("Adivinhe o número?");
            int numero = sc.nextInt();

            if (numero > 100) {
                System.out.println("O número digitado não pode ser maior que 100");
            } else if (numero == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                break;
            } else {
                contador--;
                System.out.println("Errou! Você tem " + contador + " chances para acertar");

                if (numero > numeroAleatorio) {
                    System.out.println("O número digitado é maior que o número sorteado");
                } else {
                    System.out.println("O número digitado é menor que o número sorteado");
                }
            }
        }

        System.out.println("Número sorteado: " + numeroAleatorio); */

        while(numeroTentativas < 5) {
            System.out.println("Digite um número entre 0 a 100");
            int numeroDigitado = sc.nextInt();
            numeroTentativas++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                break;
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número aleatório");
            } else {
                System.out.println("O número digitado é maior que o número aleatório");
            }

        }

        if (numeroTentativas == 5) {
            System.out.println("Game Over, o número aleatório era " + numeroAleatorio + " .");
        }

    }
}