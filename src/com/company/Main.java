package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Parašykite programą, kuri paprašytų įvesti vartotojo du skaičius ir atspausdinti jų
        //skirtumą bei sumą

        //Papildyti 1.3  programą sumos ir skirtumo skaičiavimai turi būti skirtinguose metoduose.


        Scanner in = new Scanner(System.in);
        int sk1, sk2;

        System.out.println("Iveskite du skaicius: ");
        sk1 = in.nextInt();
        sk2 = in.nextInt();

        System.out.println("Suma: " + (sk1 + sk2));
        System.out.println("Skirtumas: " + (sk1 - sk2));
    }

}