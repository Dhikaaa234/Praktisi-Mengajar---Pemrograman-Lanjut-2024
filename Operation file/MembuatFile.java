import java.io.File;
import java.io.IOException;

public class MembuatFile {
    public static void main(String[] args) {

        File file1 = new File("File1.txt");
        try {
            if (file1.createNewFile()) {
                System.out.println("File 'File1.txt' berhasil dibuat.");
            } else {
                System.out.println("File 'File1.txt' sudah ada");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membuat file: " + e.getMessage());
        }

       
        System.out.println("Path absolut file: " + file1.getAbsolutePath());
        System.out.println("'File1.txt' telah dibuat. " + file1.exists());
    }
}
