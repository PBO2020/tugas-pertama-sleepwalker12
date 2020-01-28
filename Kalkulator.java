
package Kalkulator;

public class Kalkulator {

    int hasiltambah;
    int hasilkurang;
    int hasilbagi;
    int hasilkali;
    public int gethasiltambah(){
    return hasiltambah;
    }
    public int gethasilkurang(){
    return hasilkurang;
    }
    public int gethasilbagi(){
    return hasilbagi;
    }
    public int gethasilkali(){
    return hasilkali;
    }
    public void sethasiltambah(int a , int b){
    this.hasiltambah = a+b;
    }
     public void sethasilkurang(int a , int b){
    this.hasilkurang = a-b;
    }
      public void sethasilbagi(int a , int b){
    this.hasilbagi = a/b;
    }
       public void sethasilkali(int a , int b){
    this.hasilkali = a*b;
    }
}
