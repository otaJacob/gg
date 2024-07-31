
package trinta;
import java.util.ArrayList;
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Integer> numeros = new ArrayList<>();

			System.out.println("Digite números inteiros (digite '0' para finalizar):");

			while (true) {
			    int numero = scanner.nextInt();
			    if (numero == 0) {
			        break;
			    }
			    numeros.add(numero);
			}

			int soma = 0;
			for (int num : numeros) {
			    soma += num;
			}

			System.out.println("A soma de todos os números é: " + soma);
		}
    }
}