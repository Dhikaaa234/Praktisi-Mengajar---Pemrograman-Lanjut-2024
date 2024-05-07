import java.util.LinkedList;
import java.util.Queue;

public class SistemAntrianRumahSakit {
    private Queue<String> antrianPasien;

    public SistemAntrianRumahSakit() {
        antrianPasien = new LinkedList<>();
    }

    public void tambahPasien(String namaPasien) {
        if (antrianPasien.add(namaPasien)) {
            System.out.println(namaPasien + " telah ditambahkan ke dalam antrian.");
        } else {
            System.out.println("Gagal menambahkan pasien ke dalam antrian.");
        }
    }

    public void tampilkanAntrian() {
        if (!antrianPasien.isEmpty()) {
            System.out.println("Antrian saat ini:");
            for (String namaPasien : antrianPasien) {
                System.out.println("- " + namaPasien);
            }
        } 
    }

    public static void main(String[] args) {
        SistemAntrianRumahSakit RS = new SistemAntrianRumahSakit();

        RS.tambahPasien("Yaya");
        RS.tambahPasien("Ying");
        RS.tambahPasien("Asep");

        RS.tampilkanAntrian();
    }
}
