package com.kcs.example;

import java.util.Scanner;

public class ThirdExample {
    public static void main(String[] args){
        String vardas;
        String lygNelyg;
        Scanner sc = new Scanner(System.in);
        ThirdExample example = new ThirdExample();
        do {
            System.out.println("Iveskite varda:");
            vardas = sc.nextLine();
            example.printMethodEven(vardas);

        }while (vardas !="Pabaiga");
    }

    private void printMethodEven(String name){
        if(name.toLowerCase().equals("pabaiga")){
            return;
        }
        if(name.length() % 2 == 0){
            System.out.println(name + " yra lyginio ilgio vardas, jo ilgis: " + name.length());
        }else{
            System.out.println(name + " yra nelyginio ilgio vardas, jo ilgis: " + name.length());
        }
    }
    // komentaras
    private static int getNumberOfLetters(String name, char letter){
        int count = 0;
        for (int i = 0; i < name.length(); i++){
            char l = name.charAt(i);
            if(l == letter){
                count++;
            }
        }
        return count;
    }
}
