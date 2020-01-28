
package Kalkulator;

public class Main {
    public static void main(String args[]){
    Kalkulator ot = new Kalkulator();
    ot.sethasiltambah(8,4);
    ot.sethasilkurang(8,4);
    ot.sethasilbagi(8,4);
    ot.sethasilkali(8,4);
        System.out.println("hasil adalah : " + ot.gethasiltambah());
        System.out.println("hasilnya adalah : " + ot.gethasilkurang());
        System.out.println("hasilnya adalah : " + ot.gethasilbagi());
        System.out.println("hasilnya adalah : " + ot.gethasilkali());
    }
    
}
