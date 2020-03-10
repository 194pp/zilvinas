package second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatematikosNamuDarbai {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int select = -1;
        while (select != 0) {
            System.out.println("Pasirinkite kokios figuros plota skaiciuosite:");
            System.out.println("1. Staciakampis\n2. Kvadratas\n3. Statusis trikampis\n4. Apskritimas\n0. Pabaiga");
            try {
                select = (int)getCorrectValue(sc);
                switch (select) {
                    case 1:
                        System.out.println("Staciakampis");
                        staciakampioPlotas(sc);

                        break;
                    case 2:
                        System.out.println("Kvadratas");
                        kvadratoPlotas(sc);

                        break;
                    case 3:
                        System.out.println("Statusis Trikampis");
                        staciojoTrikampioPlotas(sc);

                        break;
                    case 4:
                        System.out.println("Apskritimas");
                        apskritimoPlotas(sc);

                        break;
                    case 0:
                        System.out.println("End");
                        break;

                    default:
                        System.out.println("Nerasta");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Blogas pasirinkimas!");
                sc.nextLine();
            }
        }


    }

    private static void kvadratoPlotas(Scanner sc) {
        System.out.println("Įveskite kraštinę:");
        double krastine = getCorrectValue(sc);
        System.out.println("Atsakymas: " + (Math.pow(krastine, 2)));
    }

    private static void staciakampioPlotas(Scanner sc) {
        System.out.println("Įveskite pirmą kraštinę:");
        double krastine1 = getCorrectValue(sc);
        System.out.println("Įveskite antrą kraštinę:");
        double krastine2 = getCorrectValue(sc);
        System.out.println("Atsakymas: " + krastine1 * krastine2);
    }

    private static void apskritimoPlotas(Scanner sc) {
        System.out.println("Įveskite apskritimo spindulį:");
        double krastine = getCorrectValue(sc);
        System.out.println("Atsakymas: " + Math.PI * Math.pow(krastine, 2));
    }

    private static void staciojoTrikampioPlotas(Scanner sc) {
        System.out.println("Įveskite trikampio pirmają statinę:");
        double stat1 = getCorrectValue(sc);
        System.out.println("Įveskite trikampio antrają statinę:");
        double stat2 = getCorrectValue(sc);
        System.out.println("Atsakymas: " + stat1 * stat2 / 2);
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