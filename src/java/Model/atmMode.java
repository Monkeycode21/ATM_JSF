/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Dao.Dao;
/**
 *
 * @author willi
 */
public class atmMode implements Dao{

    startSaldo saldo;
    
    public atmMode(){
        this.saldo = new startSaldo();
    }
    
    public int limit(){
        return this.saldo.batas;
    }
    
    @Override
    public int getSaldo() {
        return this.saldo.getAwal();
    }

    @Override
    public int transaksi(int jumlah) {
        if(jumlah % 50000 == 0){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void tambah(int jumlah) {
        saldo.setAwal(saldo.getAwal()+jumlah);
    }

    @Override
    public void tarik(int jumlah) {
        saldo.setAwal(saldo.getAwal()-jumlah);
    }

    @Override
    public boolean cekBatas() {
        if(this.saldo.getAwal() <= this.saldo.batas){
            return true;
        } else {
            return false;
        }
    }
}