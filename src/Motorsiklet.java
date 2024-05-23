public class Motorsiklet {
    String marka;
    String model;
    int yil;
    int motorHacmi; // Motor hacmi cc cinsinden

    public Motorsiklet(String marka, String model, int yil, int motorHacmi) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.motorHacmi = motorHacmi;
    }

    public void bilgileriYazdir() {
        System.out.println("Motorsiklet - Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
        System.out.println("Motor Hacmi: " + motorHacmi + " cc");
        System.out.println();
    }
}
