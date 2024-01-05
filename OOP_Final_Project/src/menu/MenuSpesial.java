package menu;

public class MenuSpesial extends Menu {
    private String narasi;

    public MenuSpesial(int id, String nama, int harga, String narasi) {
        super(id, nama, harga);
        this.narasi = narasi;
    }

    public String getNarasi() {
        return narasi;
    }

    public void setNarasi(String narasi) {
        this.narasi = narasi;
    }

    @Override
    public String toString() {
        return super.toString() + "Narasi: " + narasi + "\n";
    }
}

