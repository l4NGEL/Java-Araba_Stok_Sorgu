public class Kamyon extends Tasit {
    int yukKapasitesi;

    public Kamyon(String marka, String model, int yil, int yukKapasitesi) {
        super(marka, model, yil);
        this.yukKapasitesi = yukKapasitesi;
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Kamyon - Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
        System.out.println("Yük Kapasitesi: " + yukKapasitesi + " ton");
    }
}
