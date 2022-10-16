/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author willi
 */
public interface Dao {
    int getSaldo();
    int transaksi(int jumlah);
    void tambah(int jumlah);
    void tarik(int jumlah);
    boolean cekBatas();
}
