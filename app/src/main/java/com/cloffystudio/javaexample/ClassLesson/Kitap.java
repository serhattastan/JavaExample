package com.cloffystudio.javaexample.ClassLesson;

public class Kitap {
    // Kitap bilgilerini tutan özellikler
    private String ad;       // Kitabın adı
    private String yazar;    // Kitabın yazarı
    private String isbn;     // Kitabın ISBN numarası
    private boolean oduncte; // Kitabın ödünçte olup olmadığını belirten durum

    // Constructor: Kitap nesnesi oluşturulurken temel bilgileri alır
    public Kitap(String ad, String yazar, String isbn) {
        this.ad = ad;
        this.yazar = yazar;
        this.isbn = isbn;
        this.oduncte = false; // Kitap başta ödünçte değil
    }

    // Getter metotlar: Kitap özelliklerini almak için kullanılır
    public String getAd() {
        return ad;
    }

    public String getYazar() {
        return yazar;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isOduncte() {
        return oduncte;
    }

    // Kitabı ödünç verme metodu
    public void oduncVer() {
        if (!oduncte) { // Eğer kitap ödünçte değilse
            oduncte = true; // Kitabı ödünç ver
            System.out.println(ad + " kitabı ödünç verildi.");
        } else {
            System.out.println(ad + " kitabı zaten ödünçte."); // Kitap zaten ödünçte
        }
    }

    // Kitabı iade etme metodu
    public void iadeEt() {
        if (oduncte) { // Eğer kitap ödünçteyse
            oduncte = false; // Kitabı iade al
            System.out.println(ad + " kitabı iade edildi.");
        } else {
            System.out.println(ad + " kitabı zaten kütüphanede."); // Kitap zaten kütüphanede
        }
    }
}