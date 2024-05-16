import java.util.LinkedList;
import java.util.Queue;

public class antrianRumahSakit {
    private Queue<String> antrianPasien;
    private static final int kapasitasMaxAntrian = 10; 

    public antrianRumahSakit() {
        antrianPasien = new LinkedList<>();
    }

    public void tambahPasien(String namaPasien) {
        try {
            if (antrianPasien.size() >= kapasitasMaxAntrian) {
                throw new IllegalStateException("Antrian sudah mencapai batas maksimum. Tidak dapat menambahkan pasien baru.");
            }

            if (namaPasien.matches("\\d+")) {
                throw new IllegalArgumentException("Nama pasien tidak boleh berupa angka");
            }

            if (antrianPasien.add(namaPasien)) {
                System.out.println(namaPasien + " telah ditambahkan ke dalam antrian.");
            } 

        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Kesalahan: " + e.getMessage());
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
        } 
}
