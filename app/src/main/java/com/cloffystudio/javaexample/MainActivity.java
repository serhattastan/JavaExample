package com.cloffystudio.javaexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.cloffystudio.javaexample.ClassLesson.Kitap;
import com.cloffystudio.javaexample.ClassLesson.Kutuphane;
import com.cloffystudio.javaexample.ClassLesson.Uye;
import com.cloffystudio.javaexample.Method.HesapMakinesi;
import com.cloffystudio.javaexample.Method.Matematik;
import com.cloffystudio.javaexample.Method.Ornek;
import com.cloffystudio.javaexample.MuslukExample.Catlak;
import com.cloffystudio.javaexample.MuslukExample.Havuz;
import com.cloffystudio.javaexample.MuslukExample.Musluk;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//        erişimBelirleyici dönüşTipi methodAdi(parametreler) {
//            // Kodlar
//            return değer; // Eğer dönüş tipi void değilse
//        }

        Ornek ornek = new Ornek();
        ornek.selamVer();  // Çıktı: Merhaba! Java öğreniyoruz.

        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        hesapMakinesi.toplamaYap(5, 10);  // Çıktı: Toplam: 15

        int sonuc = HesapMakinesi.kareAl(4);
        System.out.println("Sonuç: " + sonuc);  // Çıktı: Sonuç: 16

        int sonuc2 = hesapMakinesi.carpmaYap(6, 7);
        System.out.println("Sonuç: " + sonuc2);  // Çıktı: Sonuç: 42

        Matematik matematik = new Matematik();
        System.out.println("Tam sayı toplama: " + matematik.topla(5, 10));  // Çıktı: 15
        System.out.println("Ondalık toplama: " + matematik.topla(5.5, 10.2));  // Çıktı: 15.7

        TextView textView = findViewById(R.id.textView);
        Button buttonSelam = findViewById(R.id.buttonSelam);
        buttonSelam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Merhaba!");
            }
        });


        Havuz havuz = new Havuz(1000);

        // Muslukların eklenmesi
        Musluk musluk1 = new Musluk(4); // Saniyede 4 litre su akıtan musluk
        Musluk musluk2 = new Musluk(3, 2); // 2 saniye sonra açılan musluk
        havuz.muslukEkle(musluk1);
        havuz.muslukEkle(musluk2);

        // Çatlakların eklenmesi
        Catlak catlak1 = new Catlak(5); // Saniyede 5 litre su sızdıran çatlak
        Catlak catlak2 = new Catlak(6, 250); // 250 litre dolunca etkili olan çatlak
        havuz.catlakEkle(catlak1);
        havuz.catlakEkle(catlak2);

        // Havuzun dolum süresini hesaplama
        float dolumSuresi = havuz.dolumSuresiHesapla();
        System.out.printf("Havuzun dolum süresi: %.2f saniye\n", dolumSuresi);



        // Kütüphane oluşturma
        Kutuphane kutuphane = new Kutuphane();

        // Kitapları tanımlama ve ekleme
        Kitap kitap1 = new Kitap("Java Programlama", "Serhat Taştan", "12345");
        Kitap kitap2 = new Kitap("Mobil Uygulamalar", "Ahmet Yılmaz", "67890");
        kutuphane.kitapEkle(kitap1);
        kutuphane.kitapEkle(kitap2);

        // Üyeleri tanımlama ve ekleme
        Uye uye1 = new Uye("Ayşe Kaya", 1);
        Uye uye2 = new Uye("Mehmet Demir", 2);
        kutuphane.uyeEkle(uye1);
        kutuphane.uyeEkle(uye2);

        // Kitap ödünç alma işlemi
        uye1.kitapOduncAl(kitap1);

        // Kütüphanedeki kitapları listeleme
        kutuphane.tumKitaplariListele();

        // Üyenin ödünç aldığı kitapları listeleme
        uye1.oduncAlinanKitaplariListele();

        // Kitap iade işlemi
        uye1.kitapIadeEt(kitap1);

        // Güncel durumu listeleme
        kutuphane.tumKitaplariListele();

    }
}