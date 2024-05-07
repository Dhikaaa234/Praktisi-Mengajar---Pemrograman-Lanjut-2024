package Deque;

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
 