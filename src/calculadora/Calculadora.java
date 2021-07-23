package calculadora;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        float somar = somar(a, b);
        float subtrair = subtrair(a, b);
        float multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("somar: " + somar);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dividir: " + dividir);

    }

    public static float somar(float a, float b) {
        return a + b;
    }
    public static float subtrair(float a, float b) {
        return a - b;
    }
    public static float multiplicar(float a, float b) {
        return a * b;
    }
    public static float dividir(float a, float b) {
        return a / b;
    }

}
