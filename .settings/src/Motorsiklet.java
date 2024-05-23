
public class Motorsiklet extends Tasit {
    int motorHacmi;

    public Motorsiklet(String marka, String model, int yil, int motorHacmi) {
        super(marka, model, yil);
        this.motorHacmi = motorHacmi;
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Motorsiklet - Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
        System.out.println("Motor Hacmi: " + motorHacmi + " cc");
    }
}
