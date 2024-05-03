/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dequeque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author ANDHIKA ANANTA PUTRA
 */
public class Dequeque {

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
