import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SistemAntrianRumahSakit {
    private Queue<String> antrianPasien;
    private static final int kapasitasMaxAntrian = 10;
    private static final String FILE_NAME = "DaftarAntrianRumahSakit.txt";

    public SistemAntrianRumahSakit() {
        antrianPasien = new LinkedList<>();
    }

    public void tambahPasien(String namaPasien) {
        try {
            if (namaPasien.matches("\\d+")) {
                throw new IllegalArgumentException("Nama pasien tidak boleh berupa angka");
            }

            if (antrianPasien.size() >= kapasitasMaxAntrian) {
                throw new IllegalStateException("Antrian sudah mencapai batas maksimum. Tidak dapat menambahkan pasien baru.");
            }

            if (antrianPasien.add(namaPasien)) {
                System.out.println(namaPasien + " telah ditambahkan ke dalam antrian.");
                simpanDataAntrian(namaPasien, antrianPasien.size(), LocalDate.now());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }

    public void hapusPasien(String namaPasien) {
        if (antrianPasien.remove(namaPasien)) {
            System.out.println(namaPasien + " telah dihapus dari antrian.");
        } else {
            System.out.println(namaPasien + " tidak ditemukan dalam antrian.");
        }
    }

    public void tampilkanAntrian() {
        if (!antrianPasien.isEmpty()) {
            System.out.println("Antrian saat ini:");
            for (String namaPasien : antrianPasien) {
                System.out.println("- " + namaPasien);
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    private void simpanDataAntrian(String namaPasien, int nomorAntrian, LocalDate tanggal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(nomorAntrian + "," + namaPasien + "," + tanggal + "\n");
        } catch (IOException e) {
            System.out.println("Kesalahan saat menyimpan data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        File fileAntrian = new File(FILE_NAME);
        if (fileAntrian.exists()) {
            System.out.println("File antrian ditemukan. Memuat data antrian...");
        } else {
            System.out.println("File antrian tidak ditemukan. Membuat file baru...");
            try {
                fileAntrian.createNewFile();
            } catch (IOException e) {
                System.out.println("Kesalahan saat membuat file antrian: " + e.getMessage());
            }
        }

        SistemAntrianRumahSakit RS = new SistemAntrianRumahSakit();
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Antrian Pasien");
            System.out.println("2. Hapus Antrian Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan nama pasien: ");
                    String namaPasien = scanner.nextLine();
                    RS.tambahPasien(namaPasien);
                    break;
                case "2":
                    System.out.print("Masukkan nama pasien yang akan dihapus: ");
                    String namaPasienHapus = scanner.nextLine();
                    RS.hapusPasien(namaPasienHapus);
                    break;
                case "3":
                    RS.tampilkanAntrian();
                    break;
                case "4":
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (!pilihan.equals("4"));

        scanner.close();
    }
}
