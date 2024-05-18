import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        try {
            File inputFile = new File("D:\\teks.txt");
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String a = bufferedReader.readLine ();
            while (a != null) {
                System.out.println(a);
                a = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("File tidak ada atau terjadi kesalahan I/O: " + e.getMessage());
            }
        }
}
