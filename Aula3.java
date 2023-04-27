import java.util.Scanner;
public class Aula3 {
    public static void main (System [] args) {
        double valor1, valor2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor! ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor !");
        valor2 = scanner.nextDouble();

        System.out.println("Selecione a operacao que deseja realizar:");

        System.out.println("1. adicao !");

        System.out.println("2. Subtracao !");

        System.out.println("3. Multiplicacao !");

        System.out.println("4. Divisao !");

        int operacao = scanner.nextInt();

        double resultado = 0.0;

        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;

                break;

            case '-':
                resultado = valor1 - valor2;
                break;

            case '*':
                resultado = valor1 * valor2;
                break;

            case '/':
                resultado = valor1 / valor2;
                break;


        }

        System.out.println(" Resultado " + resultado + "!");
    }

}
