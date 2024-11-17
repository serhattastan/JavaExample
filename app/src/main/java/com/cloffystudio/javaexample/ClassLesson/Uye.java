package com.cloffystudio.javaexample.ClassLesson;

import java.util.ArrayList;
import java.util.List;

public class Uye {
    // Üye bilgilerini tutan özellikler
    private String ad;                    // Üyenin adı
    private int uyeNo;                    // Üyenin numarası
    private List<Kitap> oduncAlinanKitaplar; // Üyenin ödünç aldığı kitapların listesi

    // Constructor: Üye nesnesi oluşturulurken bilgileri alır
    public Uye(String ad, int uyeNo) {
        this.ad = ad;
        this.uyeNo = uyeNo;
        this.oduncAlinanKitaplar = new ArrayList<>(); // Boş bir liste oluşturulur
    }

    // Getter metotlar: Üye bilgilerini almak için kullanılır
    public String getAd() {
        return ad;
    }

    public int getUyeNo() {
        return uyeNo;
    }

    // Üyenin bir kitabı ödünç alması
    public void kitapOduncAl(Kitap kitap) {
        if (!kitap.isOduncte()) { // Eğer kitap ödünçte değilse
            kitap.oduncVer(); // Kitap ödünç verilir
            oduncAlinanKitaplar.add(kitap); // Kitap üyenin listesine eklenir
        } else {
            System.out.println(kitap.getAd() + " kitabı ödünç alınamıyor."); // Kitap ödünçte
        }
    }

    // Üyenin bir kitabı iade etmesi
    public void kitapIadeEt(Kitap kitap) {
        if (oduncAlinanKitaplar.contains(kitap)) { // Eğer kitap üyenin listesinde varsa
            kitap.iadeEt(); // Kitap iade edilir
            oduncAlinanKitaplar.remove(kitap); // Kitap listeden çıkarılır
        } else {
            System.out.println(kitap.getAd() + " kitabı bu üye tarafından iade edilemez.");
        }
    }

    // Üyenin ödünç aldığı kitapları listeleme
    public void oduncAlinanKitaplariListele() {
        System.out.println(ad + " adlı üyenin ödünç aldığı kitaplar:");
        for (Kitap kitap : oduncAlinanKitaplar) {
            System.out.println("- " + kitap.getAd());
        }
    }
}