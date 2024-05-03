/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author ANDHIKA ANANTA PUTRA
 */
package com.mycompany.datasaya;

public class DataSaya <T> {
    private T dataFirst;

    public DataSaya(T dataFirst) {
        this.dataFirst = dataFirst;
    }

    public T getFirst() {
        return dataFirst;
    }
    
    public void setFirst(T dataFirst) {
    this.dataFirst = dataFirst;
    }
}
