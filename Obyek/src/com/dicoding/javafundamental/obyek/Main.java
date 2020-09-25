package com.dicoding.javafundamental.obyek;
//obyek dalam java sama seperti Struck pada c++
public class Main {
    public static void main(String[]args){
      Hewan Elang = new Hewan("Elang");//membuat obyek elang
      Hewan Kucing = new Hewan("Kucing");//membuat obyek kucing

      Elang.beratHewan(5);
      Elang.jumlahKakiHewan(2);
      Elang.cetakHewan();

      Kucing.beratHewan(2);
      Kucing.jumlahKakiHewan(4);
      Kucing.cetakHewan();

    }
}
