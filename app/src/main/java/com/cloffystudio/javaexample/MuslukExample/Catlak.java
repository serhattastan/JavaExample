package com.cloffystudio.javaexample.MuslukExample;

public class Catlak {
    private int hiz; // Çatlağın su sızdırma hızı (litre/saniye)
    private int baslamaSeviyesi; // Çatlağın etkisi başlama seviyesi (litre)

    // Constructor: Çatlak oluşturulurken hız ve başlama seviyesi atanır
    public Catlak(int hiz, int baslamaSeviyesi) {
        this.hiz = hiz;
        this.baslamaSeviyesi = baslamaSeviyesi;
    }

    public Catlak(int hiz) {
        this(hiz, 0); // Başlama seviyesi belirtilmezse hemen etkili olur
    }

    // Getter metotlar
    public int getHiz() {
        return hiz;
    }

    public int getBaslamaSeviyesi() {
        return baslamaSeviyesi;
    }
}