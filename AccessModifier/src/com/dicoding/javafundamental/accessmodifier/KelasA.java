package com.dicoding.javafundamental.accessmodifier;

public class KelasA {
  private int memberA = 5;

  private int functionA(){
      return memberA;
    }

    int functionB(){
      //pemanggilan private function dan private member
      int hasil = functionA() + memberA;
      return hasil;
    }
}
