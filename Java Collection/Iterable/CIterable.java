package Iterable;

import java.util.List;

public class CIterable {
    public static void main(String[] args) {
        Iterable<String> nama = List.of("Andhika");

        for(var name: nama){
            System.out.println(name);
        }
    }
    
}
