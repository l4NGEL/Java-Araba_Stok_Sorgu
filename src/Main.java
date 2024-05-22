// Araba sınıfı
class Araba {
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

public class Main {
    public static void main(String[] args) {
        // Dört farklı araç nesnesi oluşturma
        Araba araba1 = new Araba("Toyota", "Corolla", 2020, "Beyaz");
        Araba araba2 = new Araba("Honda", "Civic", 2018, "Siyah");
        Araba araba3 = new Araba("Ford", "Focus", 2019, "Mavi");
        Araba araba4 = new Araba("BMW", "320i", 2021, "Gri");

        // Araç bilgilerini ekrana yazdırma
        araba1.bilgileriYazdir();
        araba2.bilgileriYazdir();
        araba3.bilgileriYazdir();
        araba4.bilgileriYazdir();
    }
}
