package com.cloffystudio.javaexample.MuslukExample;

public class Musluk {
    private int hiz; // Musluktan akan suyun hızı (litre/saniye)
    private int acilmaSuresi; // Musluğun açılma zamanı (saniye)

    // Constructor: Musluk oluşturulurken hız ve açılma süresi atanır
    public Musluk(int hiz, int acilmaSuresi) {
        this.hiz = hiz;
        this.acilmaSuresi = acilmaSuresi;
    }

    public Musluk(int hiz) {
        this(hiz, 0); // Açılma süresi belirtilmezse musluk hemen açılır
    }

    // Getter metotlar
    public int getHiz() {
        return hiz;
    }

    public int getAcilmaSuresi() {
        return acilmaSuresi;
    }
}
