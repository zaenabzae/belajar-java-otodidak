package com.dicoding.javafundamnetal.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferdReader {
    public static void main(String[]args){
        InputStreamReader isr = new InputStreamReader(System.in); //agar BufferdReader dapat dipakai
        BufferedReader bufferedReader = new BufferedReader(isr);
        System.out.println("Program penjumlahan sangat sederhana");
        int value1 = 0;
        int value2 =0;

        try{
            System.out.print("Masukkan angka pertama : ");
            value1 = Integer.parseInt(bufferedReader.readLine());//ubah string ke number

            System.out.print(("Masukka angka kedua : "));
            value2 = Integer.parseInt(bufferedReader.readLine());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        int hasil = value1 + value2;
        System.out.println("Hasilny adalah : " + hasil);
    }

}
