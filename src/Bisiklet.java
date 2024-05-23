public class Bisiklet {
    String marka;
    String model;
    int vitesSayisi;
    boolean elektrikli; // Elektrikli mi değil mi

    public Bisiklet(String marka, String model, int vitesSayisi, boolean elektrikli) {
        this.marka = marka;
        this.model = model;
        this.vitesSayisi = vitesSayisi;
        this.elektrikli = elektrikli;
    }

    public void bilgileriYazdir() {
        System.out.println("Bisiklet - Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Vites Sayısı: " + vitesSayisi);
        System.out.println("Elektrikli: " + (elektrikli ? "Evet" : "Hayır"));
        System.out.println();
    }
}
