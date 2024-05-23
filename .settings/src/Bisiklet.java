public class Bisiklet implements Tasitable {
    String marka;
    String model;
    int vitesSayisi;
    boolean elektrikli;

    public Bisiklet(String marka, String model, int vitesSayisi, boolean elektrikli) {
        this.marka = marka;
        this.model = model;
        this.vitesSayisi = vitesSayisi;
        this.elektrikli = elektrikli;
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Bisiklet - Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Vites Sayısı: " + vitesSayisi);
        System.out.println("Elektrikli: " + (elektrikli ? "Evet" : "Hayır"));
    }
}

