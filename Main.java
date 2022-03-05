import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String numero1 = getInput("Digite um número: ");
        String numero2 = getInput("Digite um número: ");
        String operacao = getInput("Escolha uma operação: (+ - * /): ");

        double resultado = 0;

        try {
            switch (operacao) {
                case "+":
                    resultado = somar(numero1, numero2);
                    break;
                case "-":
                    resultado = subtrair(numero1, numero2);
                    break;
                case "*":
                    resultado = multiplicar(numero1, numero2);
                    break;
                case "/":
                    resultado = dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Operação inválida!");
                    return;
            }
            System.out.println("O resultado é: " + resultado);
        }
        catch (Exception e) {
            System.out.println("Número inválido: " + e.getMessage());
        }
    }

    private static double somar(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    private static double subtrair(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    private static double multiplicar(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    private static double dividir(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }

    private static String getInput(String frase) {
        System.out.print(frase);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}