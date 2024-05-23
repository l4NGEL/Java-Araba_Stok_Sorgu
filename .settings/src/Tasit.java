public abstract class Tasit implements Tasitable {
    String marka;
    String model;
    int yil;

    public Tasit(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    @Override
    public abstract void bilgileriYazdir();
}
