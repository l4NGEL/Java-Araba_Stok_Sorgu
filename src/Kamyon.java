public class Kamyon {
    String marka;
    String model;
    int yil;
    int yukKapasitesi; // Yük kapasitesi ton cinsinden

    public Kamyon(String marka, String model, int yil, int yukKapasitesi) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.yukKapasitesi = yukKapasitesi;
    }

    public void bilgileriYazdir() {
        System.out.println("Kamyon - Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
        System.out.println("Yük Kapasitesi: " + yukKapasitesi + " ton");
        System.out.println();
    }
}
