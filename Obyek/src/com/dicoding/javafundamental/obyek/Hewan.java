package com.dicoding.javafundamental.obyek;

public class Hewan {//deklarasi obyek dan juga atribut
    String nama;
    int berat;
    int jumlahKaki;

    //ini merupakan konstruktor dari kelas hewan
    //konstruktor adalah method yang pertama kali dijalankan ketika obyek diciptakan

    public Hewan(String namaHewan){//membuat method string
        nama = namaHewan;
    }
    public void beratHewan(int beratHewan){//membuat method number
        berat = beratHewan;
    }
    public void jumlahKakiHewan(int jumlahKakiHewan){
        jumlahKaki = jumlahKakiHewan;
    }
    public void cetakHewan(){
        System.out.println("Nama hewan : "+ nama);
        System.out.println("Berat hewan : "+ berat +"kg");
        System.out.println("Jumlah kaki hewan : " + jumlahKaki);
    }
}
