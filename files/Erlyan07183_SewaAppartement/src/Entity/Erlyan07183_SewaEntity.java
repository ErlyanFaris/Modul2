package Entity;

import java.util.Date;

public class Erlyan07183_SewaEntity extends Erlyan07183_AppartementAbstractEntity{
    private String Appartement;

    public Erlyan07183_SewaEntity(String password, String nama, String email, String unit, String harga, String notelp, Date Tanggalbooking) {
        super(password, nama, email, unit, harga, notelp, Tanggalbooking);
        this.Appartement = Appartement;
    }
     @Override
     
    public String getUnit() {
        return unit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getTanggalbooking() {
        return Tanggalbooking;
    }

    public void setTanggalbooking(Date Tanggalbooking) {
        this.Tanggalbooking = Tanggalbooking;
    }
    public String getAppartement() {
        return Appartement;
    }
    public void setAppartement(String Appartement) {
        this.Appartement = Appartement;
    }

   

    
    
}
