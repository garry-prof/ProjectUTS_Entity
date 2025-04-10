/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Client;

/**
 *
 * @author GARRY
 */
public class akun {

    public akun(String nama, String username, String email, int nomorTelp, String pwd) {
        this.nama = nama;
        this.username = username;
        this.email = email;
        this.nomorTelp = nomorTelp;
        this.pwd = pwd;
    }
    // Getter
    public String getNama() {
        return nama;
    }

    public int getNomorTelp() {
        return nomorTelp;
    }
    public String getEmail(){
        return email;
    }
    private String nama;
    private String username;
    private String email;
    private int nomorTelp;
    private String pwd;
}
