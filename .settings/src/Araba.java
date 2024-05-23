// Araba sınıfı
public class Araba implements Tasitable{
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

    @Override
    public void bilgileriYazdir() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl" + yil);
        System.out.println("Renk: " + renk);
    }
}
