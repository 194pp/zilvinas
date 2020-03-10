package com.kcs.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Iveskite skaiciu: ");
        try {
            int result = sc.nextInt();
            System.out.println("Ivestas skaicius yra: " + result);
            if (result%2 == 0){
                System.out.println("Skaicius lyginis");
            }
            else {
                System.out.println("Skaicius nelyginis");
            }
        }catch (InputMismatchException e){
            System.out.println("Blogas formatas!!!");
        }

    }
}
