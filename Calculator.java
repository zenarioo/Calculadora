import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1, num2, result = 0;

        System.out.println("BEM-VINDO À CALCULADORA!");
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextFloat();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero não permitida.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + result);
        scanner.close();
    }
}
