/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Client;

/**
 *
 * @author GARRY
 */
public class tickets {

    public tickets(String namaKonser, String jenis, Double harga, int jumlah) {
        this.namaKonser = namaKonser;
        this.jenis = jenis;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNamaKonser() {
        return namaKonser;
    }

    public String getJenis() {
        return jenis;
    }

    public Double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }
    private String namaKonser;
    private String jenis;
    private Double harga;
    private int jumlah;
}
