package Soma;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário o primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        // Solicita ao usuário o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        // Calcula a soma dos dois números
        int soma = numero1 + numero2;
        
        // Exibe o resultado da soma
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);
        
        // Fecha o scanner
        scanner.close();
    }
}
