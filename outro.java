package trinta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class outro {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Integer> numeros = new ArrayList<>();

	        System.out.println("Digite a quantidade de números: ");
	        int quantidade = scanner.nextInt();

	        System.out.println("Digite os números: ");
	        for (int i = 0; i < quantidade; i++) {
	            numeros.add(scanner.nextInt());
	        }

	        System.out.println("Números pares:");
	        for (int numero : numeros) {
	            if (numero % 2 == 0) {
	                System.out.println(numero);
	            }
	        }

	        scanner.close();
	    }
	}

