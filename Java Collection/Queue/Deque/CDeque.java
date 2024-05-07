package Deque;

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
 