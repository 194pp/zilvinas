package com.kcs.example;

import java.util.Scanner;

public class SecondExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite varda: ");

        String vardas = sc.nextLine();
        System.out.println("Vardo ilgis: " + vardas.length());

    }
}
