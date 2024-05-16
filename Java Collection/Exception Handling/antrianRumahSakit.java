import java.util.LinkedList;
import java.util.Queue;

public class antrianRumahSakit {
    private Queue<String> antrianPasien;
    private static final int Kapasitas_Max_Antrian = 10; 

    public antrianRumahSakit() {
        antrianPasien = new LinkedList<>();
    }

    public void tambahPasien(String namaPasien) {
        try {
            if (antrianPasien.size() >= Kapasitas_Max_Antrian) {
                throw new IllegalStateException("Kapasitas antrian telah mencapai batas maksimum");
            }

            try {
                Integer.parseInt(namaPasien);
                throw new IllegalArgumentException("Nama pasien tidak boleh berupa angka");
            } catch (NumberFormatException e) {}

            if (antrianPasien.add(namaPasien)) {
                System.out.println(namaPasien + " telah ditambahkan ke dalam antrian.");
            } else {
                System.out.println("Gagal menambahkan pasien ke dalam antrian.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menambahkan pasien: " + e.getMessage());
        }
    }

    public void tampilkanAntrian() {
        try {
            if (!antrianPasien.isEmpty()) {
                System.out.println("Antrian saat ini:");
                for (String namaPasien : antrianPasien) {
                    System.out.println("- " + namaPasien);
                }
            } 
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menampilkan antrian: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            antrianRumahSakit RS = new antrianRumahSakit();

            RS.tambahPasien("Yaya");
            RS.tambahPasien("Surta");
            RS.tambahPasien("Kyla");
            RS.tambahPasien("004");
            RS.tambahPasien("005"); 
            RS.tambahPasien("Ying");
            RS.tambahPasien("Gopal");
            RS.tambahPasien("Hidra");
            RS.tambahPasien("Pinki");
            RS.tambahPasien("Adi"); 
            RS.tambahPasien("Yala");
            RS.tambahPasien("Surya");
            RS.tambahPasien("Kiki");
            RS.tambahPasien("Woloo");
            
            RS.tampilkanAntrian();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
