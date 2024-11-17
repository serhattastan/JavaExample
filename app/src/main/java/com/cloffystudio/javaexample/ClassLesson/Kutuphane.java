package com.cloffystudio.javaexample.ClassLesson;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    // Kütüphane bilgilerini tutan özellikler
    private List<Kitap> kitapListesi; // Kütüphanedeki kitapların listesi
    private List<Uye> uyeListesi;     // Kütüphanedeki üyelerin listesi

    // Constructor: Kütüphane nesnesi oluşturulurken listeler başlatılır
    public Kutuphane() {
        this.kitapListesi = new ArrayList<>();
        this.uyeListesi = new ArrayList<>();
    }

    // Yeni kitap ekleme metodu
    public void kitapEkle(Kitap kitap) {
        kitapListesi.add(kitap); // Kitap listeye eklenir
        System.out.println(kitap.getAd() + " kitabı kütüphaneye eklendi.");
    }

    // Yeni üye ekleme metodu
    public void uyeEkle(Uye uye) {
        uyeListesi.add(uye); // Üye listeye eklenir
        System.out.println(uye.getAd() + " adlı üye kütüphaneye eklendi.");
    }

    // Tüm kitapları listeleme metodu
    public void tumKitaplariListele() {
        System.out.println("Kütüphanedeki tüm kitaplar:");
        for (Kitap kitap : kitapListesi) {
            System.out.println("- " + kitap.getAd() + " (" + (kitap.isOduncte() ? "Ödünçte" : "Mevcut") + ")");
        }
    }

    // Tüm üyeleri listeleme metodu
    public void tumUyeleriListele() {
        System.out.println("Kütüphanedeki tüm üyeler:");
        for (Uye uye : uyeListesi) {
            System.out.println("- " + uye.getAd() + " (Üye No: " + uye.getUyeNo() + ")");
        }
    }
}
