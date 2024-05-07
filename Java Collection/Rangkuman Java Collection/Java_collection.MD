Nama : Andhika Ananta Putra
NIM : 235150707111028
Kelas : TI-C

# JAVA COLLECTION

## Pengenalan Collection

     Collection adalah fitur bawaan dalam bahasa pemrograman atau kadang disebut container, yang merupakan object yang mengumpulkan atau berisikan data-data, mirip seperti Array. Java telah menyediakan class-class collection yang dapat digunakan tanpa memerlukan pustaka tambahan. Semua kelas dalam Java merupakan generic class.

Dalam Java Collection terdapat :

1. Interfaces
   ini adalah contract representasi dari collection.
2. Implementations
   kita juga dapat menggunakan implementasi yang sudah dibuat oleh java.
3. Algorithms
   Java juga menyediakan algoritma yang umu digunakan di collection, seperti pencarian dan pengumpulan data.

# Iterable & Iterator Interface

## 1. Iterable Interface

- Iterable adalah parent untuk semua collection di Java, kecuali Map
- Iterable sendiri sangat sederhana, hanya digunakan agar mendukung for-each loop
- Karena semua collection pasti implement iterable, secara otomatis maka semua collection di Java mendukung perulangan for-each, jadi bukan hanya Array

## Kode Iterable

```sh
import java.util.List;

public class CIterable {
    public static void main(String[] args) {
        Iterable<String> nama = List.of("Andhika");

        for(var name: nama){
            System.out.println(name);
        }
    }
}
```

## 2. Iterator Interface

- For-each di Iterable bisa terjadi karena ada method iterator() yang mengembalikan object Iterator
- Iterator adalah interface yang mendefinisikan cara kita melakukan mengakses element di collection secara sequential
- For-each sendiri muncul sejak Java 5, sebelum Java 5 untuk melakukan iterasi collection, biasanya dilakukan manual menggunakan Iterator object

# Collection Interface

- Selain Iterable interface, parent class semua collection di Java adalah Collection
- Iterable interface digunakan sebagai kontrak untuk meng-iterasi data secara sequential
- Collection merupakan kontrak untuk memanipulasi data collection, seperti menambah, menghapus dan mengecek isi data collection
- Tidak ada direct implementation untuk Collection, karena collection nanti akan dibagi lagi menjadi List, Set dan Queue.

## Kode menambah, Menghapus, dan Mengecek Data di Collection

```sh
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

        nama.remove("Rofiq");
        //menghapus data di Collection

        System.out.println(nama.contains("Dhika"));
        //Mengecek data di Collection

        for(var name: nama){
        System.out.println(name);
        }
    }
}
```

# List Interface

- List adalah struktur data collection yang memiliki sifat sebagai berikut

1. Elemen di list bisa duplikat, artinya bisa memasukkan data yang sama
2. Data list berurut sesuai dengan posisi kita memasukkan data
3. List memiliki index, sehingga kita bisa menggunakan nomor index untuk mendapatkan element di list

Di Java ada beberapa implementasi List, dan dapat dipilih sesuai dengan kebutuhan kita, diantaranya terdapat:

## 1. Array List Class

- ArrayList adalah implementasi dari List menggunakan array
- Default kapasitas array di ArrayList adalah 10
- Namun ketika kita memasukkan data dan array sudah penuh, maka secara otomatis ArrayList akan membuat array baru dengan kapasitas baru dengan ukuran kapasitas lama + data baru

## 2. Linkedlist Class

- LinkedList adalah implementasi List dengan struktur data Double Linked List

## Kode List

```sh
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
```

## Queue Interface

- Queue adalah implementasi dari struktur data Antrian atau FIFO (First In First Out)

## Array Dequeue vs LinkedList vs Priority Queue

- ArrayDeque menggunakan array sebagai implementasi queue nya
- LinkedList menggunakan double linked list sebagai implementasi queue nya
- PriorityQueue menggunakan array sebagai implementasi queue nya, namun diurutkan mennggunakan Comparable atau Comparator

## Kode Queue

```sh
import java.util.LinkedList;
import java.util.Queue;

 public class CQueue {

     public static void main(String[] args) {
         Queue<String> nama = new LinkedList<>();
         nama.offer("Mijan");
         nama.offer("Andhika");
         nama.offer("Dimskuy");

         for(String next = nama.poll(); next != null; next = nama.poll()) {
             System.out.println(next);
         }
     }
 }
```

# Dequeue

## Dequeue Interface

- Deque singkatan dari double ended queue, artinya queue yang bisa beroperasi dari depan atau belakang
- Jika pada queue, operasi yang didukung ada FIFO, namu pada deque, tidak hanya FIFO, namun juga mendukung LIFO (Last In First Out)
- Bisa dibilang deque adalah implementasi struktur data antrian dan stack (tumpukan)

## Kode Dequeue

```sh
import java.util.ArrayDeque;
 import java.util.Deque;

 public class CDeque {

     public static void main(String[] args) {
         Deque<String> nama = new ArrayDeque<>();
         nama.offerLast("Mijan");
         nama.offerLast("Andhika");
         nama.offerLast("Dimskuy");

         for(String next = nama.pollLast(); next != null; next = nama.pollLast()) {
             System.out.println(next);
         }
     }
 }
```

# Map Interface

## Map

- Map adalah struktur data collection yang berisikan mapping antara key dan value
- Dimana key di map itu harus unik, tidak boleh duplikat, dan satu key cuma boleh mapping ke satu key
- Map sebenarnya mirip dengan Array, cuma bedanya kalo di Array, key adalah index (integer), sedangkan di Map, key nya bebas kita tentukan sesuai keinginan kita

## HashMap

- HashMap adalah implementasi Map yang melakukan distribusi key menggunakan hashCode() function
- Karena HashMap sangat bergantung dengan hashCode() function, jadi pastikan kita harus membuat function hashCode seunik mungkin, karena jika terlalu banyak nilai hashCode() yang sama, maka pendistribusian key nya tidak akan optimal sehingga proses get data di Map akan semakin lambat
- Di HashMap pengecekan data duplikat dilakukan dengan menggunakan method equals nya

## Kode HashMap

```sh
import java.util.Map;

public class CMap {
    public static void main(String[] args) {
        Map<String, String> map = new java.util.HashMap<>();
        map.put("Name", "Andhika");
        System.out.println(map.get("Name"));
    }
}
```
