import java.util.ArrayList;

public class Main {
    public static <Konsumsi> void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast; + new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch; + new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Kuda");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Pecel");

        Minuman air = new Minuman();
        nasi.setNamaHidangan("Air Putih");

    }
}
