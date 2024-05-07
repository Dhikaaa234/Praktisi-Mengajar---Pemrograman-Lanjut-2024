package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CCollection {
    //Menambahkan data Collection
    public static void main(String[] args) {
        Collection<String> nama = new ArrayList<>();
        nama.add("Dhika");
        nama.add("Mizan");
        nama.addAll(Arrays.asList("Dimas", "Rofiq"));

        nama.remove("Rofiq"); //menghapus data di Collection

        System.out.println(nama.contains("Dhika")); //Mengecek data di Collection

        for(var name: nama){
        System.out.println(name);
        }
    }
}


