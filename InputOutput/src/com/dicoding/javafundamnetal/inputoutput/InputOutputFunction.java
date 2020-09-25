package com.dicoding.javafundamnetal.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in); //agar scanner dapat dipakai
        System.out.println("Program Perjumlahan sangat sederhana");

        System.out.print("Masukkan angka pertama : ");
        int value1 = scanner.nextInt(); //menangkap inputan

        System.out.print("Masukkan angka kedua : ");
        int value2 = scanner.nextInt();

        int hasil = value1 + value2;

        System.out.println("Hasilnya adalah : " + hasil);


    }
}
