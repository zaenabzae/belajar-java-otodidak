package com.dicoding.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[]args){
        System.out.println("Operator unary plus");
        int nilaiAwal1 = 5;
        int hasil = +nilaiAwal1;
        System.out.println("Hasil +5 = " + hasil);
        System.out.println();

        System.out.println("Operator unary minus");
        int nilaiAwal2 = 5;
        int hasil2 = -nilaiAwal2;
        System.out.println("Hasil -5 = " + hasil2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        int hasil3 = ++nilaiAwal3;
        System.out.println("Hasil dari ++5 = " + hasil3);
        System.out.println();

        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 5;
        int hasil4 = --nilaiAwal4;
        System.out.println("Hasil dari --5 = " + hasil4);
        System.out.println();

        System.out.println("Operator komplemen logika");
        boolean sukses = false; //nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();


    }
}
