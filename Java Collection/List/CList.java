package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CList{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); //menggunakan ArrayList
        names.add("joko");
        System.out.println(names);

        List<String> nama = new LinkedList<>(); //menggunakan LinkedList
        nama.add("Dhikaa");
        System.out.println(nama);
    }
}
