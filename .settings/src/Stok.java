import java.util.HashMap;
import java.util.Map;

public class Stok {
    private Map<String, Integer> stoklar;
    private Map<String, Tasitable> tasitlar;

    public Stok() {
        stoklar = new HashMap<>();
        setTasitlar(new HashMap<>());

        stoklar.put("Araba", 7);
        stoklar.put("Motorsiklet", 10);
        stoklar.put("Kamyon", 5);
        stoklar.put("Bisiklet", 20);
    }

    public int getStok(String tasitCesidi) {
        return stoklar.getOrDefault(tasitCesidi, 0);
    }

    public void ekleStok(String tasitCesidi, int adet) {
        stoklar.put(tasitCesidi, stoklar.getOrDefault(tasitCesidi, 0) + adet);
    }

    public boolean cikarStok(String tasitCesidi, int adet) {
        int mevcutStok = stoklar.getOrDefault(tasitCesidi, 0);
        if (mevcutStok >= adet) {
            stoklar.put(tasitCesidi, mevcutStok - adet);
            return true;
        } else {
            return false;
        }
    }

    public Map<String, Integer> getStoklar() {
        return stoklar;
    }

	public Map<String, Tasitable> getTasitlar() {
		return tasitlar;
	}

	public void setTasitlar(Map<String, Tasitable> tasitlar) {
		this.tasitlar = tasitlar;
	}
}
