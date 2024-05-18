import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Writer {
    public static void main(String[] args) {
        int kar;
        try (FileInputStream fileInp = new FileInputStream("D:\\teks.txt");
             FileOutputStream fileOut = new FileOutputStream("D:\\teks.txt")) {
            while ((kar = fileInp.read()) != -1) {
                fileOut.write(kar);
                System.out.print((char) kar); 
            }
            fileOut.close();
            fileInp.close();
        } catch (Exception e) {
            System.out.println("File tidak ada");
        }
        System.out.println("");
    }
}
