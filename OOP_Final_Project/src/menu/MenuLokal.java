package menu;

public class MenuLokal extends Menu {
    private String lokasi;
    private String ciriKhas;

    public MenuLokal(int id, String nama, int harga, String lokasi, String ciriKhas) {
        super(id, nama, harga);
        this.lokasi = lokasi;
        this.ciriKhas = ciriKhas;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getCiriKhas() {
        return ciriKhas;
    }

    @Override
    public String toString() {
        return super.toString() + "Lokasi: " + lokasi + "\nCiri Khas: " + ciriKhas + "\n";
    }
}

