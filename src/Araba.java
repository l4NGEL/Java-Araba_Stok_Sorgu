// Araba sınıfı
public class Araba {
    // Özellikler
    String marka;
    String model;
    int yil;
    String renk;

    // Yapıcı metod (Constructor)
    Araba(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }

    // Araç bilgilerini ekrana yazdırma metodu
    void bilgileriYazdir() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
        System.out.println("Renk: " + renk);
        System.out.println();
    }
}
