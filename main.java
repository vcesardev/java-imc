import java.util.Scanner;
import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso em kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double height = scanner.nextDouble();

        double imc = calculateImc(weight, height);
        String result = StringifyImcResult(imc);
        DecimalFormat layout = new DecimalFormat("0.00");
        String formattedNumber = layout.format(imc);

        System.out.println("O seu IMC é: " + formattedNumber);
        System.out.println("Resultado: " + result);

        scanner.close();
    }

    public static double calculateImc(double weight, double height) {
        return weight / (height * height);
    }

    public static String StringifyImcResult(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Normal";
        } else if (imc >= 24.9 && imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}