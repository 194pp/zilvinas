package second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KMIskaiciavimas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite savo ūgį:");
        double ugis = getCorrectValue(sc);
        System.out.println("Įveskite savo svorį:");
        double svoris = getCorrectValue(sc);
        double KMI = svoris/Math.pow(ugis, 2);
        System.out.println("KMI = " + KMI);

    }



    private static double getCorrectValue(Scanner scanner) {
        while (true) {
            try {
                double result = scanner.nextDouble();
                return result;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivesta skaiciu pakartokite");
                scanner.nextLine();
            }
        }
    }
}
