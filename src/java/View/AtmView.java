/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import Model.atmMode;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author willi
 */
@ManagedBean(name="controller")
@SessionScoped
public class AtmView {
    private atmMode model;
    private String setorTunai;
    private String tarikTunai;
    private int jumlah;
    public AtmView() {
        model = new atmMode();
    }
    public String getSetorTunai() {
        if(model.transaksi(jumlah)==1){
            model.tambah(jumlah);
            return "Transaksi berhasil";
        } else{
            return ("Setor kelipatan 50000 / 100000");
        }
    }
    public String getTarikTunai() {
                
        if(model.cekBatas()){
            return "Saldo Anda mencapai batas saldo";
        } else if((model.getSaldo()- jumlah)< model.limit()){
            return "Jumlah penarikan lebih dari limit";
        } else if((model.getSaldo()> jumlah) && (model.transaksi(jumlah) == 1)){
            model.tarik(jumlah);
            return "Transaksi berhasil";
        } else{
            return  "Penarikan kelipatan 50000 / 100000";
        }    
    
    }
    public int cekSaldo(){
        return model.getSaldo();
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
 
}