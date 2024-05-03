/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ANDHIKA ANANTA PUTRA
 */
package com.mycompany.datasaya;

public class Objek {

    public static void main(String[] args) {

        DataSaya<Integer> dataInteger = new DataSaya<>(10);
        DataSaya<String> dataString = new DataSaya<>("dua puluh");

        System.out.println("Nilai pertama (Integer): " + dataInteger.getFirst());
        System.out.println("Nilai pertama (String): " + dataString.getFirst());

    }
}

