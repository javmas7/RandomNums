package proyectoGit;

import java.util.Scanner;

public class ProyectoGit {

    // Método para generar un entero aleatorio entre min y max (ambos inclusive)
    public static int randomNum(int min, int max) {
        int menor = Math.min(min, max);
        int mayor = Math.max(min, max);
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Entre qué dos números quieres un número aleatorio?");
        System.out.print("Introduce el primer número: ");
        int n1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int n2 = scanner.nextInt();

        System.out.println("\nCon MATH RANDOM.....");
        for (int i = 0; i < 100; i++) {
            System.out.println("Número random entre " + n1 + " y " + n2 + ": " + randomNum(n1, n2));
        }

        scanner.close();
    }
}