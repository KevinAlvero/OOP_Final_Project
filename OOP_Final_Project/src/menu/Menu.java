package menu;

public class Menu {
    private int id;
    private String nama;
    private int harga;

    public Menu(int id, String nama, int harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNama: " + nama + "\nHarga: " + harga + "\n";
    }
}

