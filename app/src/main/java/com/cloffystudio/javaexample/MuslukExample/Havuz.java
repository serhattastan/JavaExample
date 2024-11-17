package com.cloffystudio.javaexample.MuslukExample;

import java.util.ArrayList;
import java.util.List;

public class Havuz {
    private int kapasite; // Havuzun toplam kapasitesi (litre)
    private List<Musluk> musluklar; // Havuzdaki muslukların listesi
    private List<Catlak> catlaklar; // Havuzdaki çatlakların listesi

    // Constructor: Havuz oluşturulurken kapasite atanır
    public Havuz(int kapasite) {
        this.kapasite = kapasite;
        this.musluklar = new ArrayList<>();
        this.catlaklar = new ArrayList<>();
    }

    // Musluk ekleme metodu
    public void muslukEkle(Musluk musluk) {
        musluklar.add(musluk);
    }

    // Çatlak ekleme metodu
    public void catlakEkle(Catlak catlak) {
        catlaklar.add(catlak);
    }

    // Dolum süresini hesaplayan metot
    public float dolumSuresiHesapla() {
        float birimDolumHizi = 0;

        // Muslukların toplam dolum hızını hesapla
        for (Musluk musluk : musluklar) {
            birimDolumHizi += 1.0 / musluk.getHiz();
        }

        // Çatlakların toplam sızma hızını hesapla
        for (Catlak catlak : catlaklar) {
            birimDolumHizi -= 1.0 / catlak.getHiz();
        }

        // Havuzun dolum süresi formülü
        return kapasite * birimDolumHizi;
    }
}