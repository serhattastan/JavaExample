package com.cloffystudio.javaexample.Method;

public class HesapMakinesi {

    public void toplamaYap(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        System.out.println("Toplam: " + sonuc);
    }

    public int carpmaYap(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public static int kareAl(int sayi) {
        return sayi * sayi;
    }

    public int faktoriyelHesapla(int sayi) {
        if (sayi <= 1) {
            return 1;
        } else {
            return sayi * faktoriyelHesapla(sayi - 1);
        }
    }
}