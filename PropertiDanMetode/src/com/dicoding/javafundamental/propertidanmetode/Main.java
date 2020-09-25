package com.dicoding.javafundamental.propertidanmetode;

public class Main {
    public static void main(String[]args){
        // Kita tambahkan 1 argumen dengan nilai int 2
        // Nilai tersebut adalah nilai yang digunakan untuk inisiasi variabel umur
        Hewan kucing = new Hewan(2);

        kucing.makan();
        kucing.lari();
        kucing.jalan();

        //contoh penggunaan fungsi get umur
    System.out.println("Umurnya adalah : "+ kucing.getUmur());

        //perhitungan indeks masa tubuh
        //berat(kg)/ tinggi(m)*tinggi(m)

    double bmi = kucing.getBerat()/((kucing.getTinggi()*0.01)* (kucing.getTinggi()*0.01));
    System.out.println("indeks masa tubuhnya adalah : "+ bmi);
    }
}
