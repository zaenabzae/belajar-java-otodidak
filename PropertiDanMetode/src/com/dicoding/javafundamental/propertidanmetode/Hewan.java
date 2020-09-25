package com.dicoding.javafundamental.propertidanmetode;

public class Hewan {
    //properti atau fields
    //inisiasi dengan nilai inisial
   double tinggi = 30 ;
   double berat = 3;

   //inisiasi meelalui konstruktor
   int umur;

   //konstruksi dengan parameter
    Hewan(int umur){
        this.umur = umur;
        //umur adalah atribut
        //this.umur adalah parameter
    }
    void lari(){
        System.out.println("Berlari dengan sangat  cepat");
    }
    void jalan(){
        System.out.println("Berjalan dengan sangat  lambat");
    }
    void makan(){
        System.out.println("Makan dengan mulut");
    }
    double getBerat(){
        return berat;
    }
    double getTinggi(){
        return tinggi;
    }
    double getUmur(){
        return umur;
    }


}
