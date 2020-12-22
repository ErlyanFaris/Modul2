/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Acer
 */
import java.util.Date;
public class Erlyan07183_Costumer extends Erlyan07183_AppartementAbstractEntity{
    private String kamar;

    public Erlyan07183_Costumer(String password,String nama,String email,String kamar, String unit, String harga, String notelp, Date Tanggalbooking) {
        super(nama,password,email,unit, harga, notelp, Tanggalbooking);
        this.kamar = kamar;
    }
    @Override
    
    public String getEmail() {
        return email;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalbooking() {
        return Tanggalbooking;
    }

    public void setTanggalbooking(Date Tanggalbooking) {
        this.Tanggalbooking = Tanggalbooking;
    }

    public String getKamar() {
        return kamar;
    }

    public void setKamar(String kamar) {
        this.kamar = kamar;
    }

    public String getPassword() {
        return password;
    }
    
}
