package Entity;

import java.util.Date;
public abstract class Erlyan07183_AppartementAbstractEntity {
   protected String email,unit,harga,notelp,nama,password;
   protected Date Tanggalbooking;

    public Erlyan07183_AppartementAbstractEntity(String password,String nama,String email,String unit,String harga, String notelp, Date Tanggalbooking) {
        this.unit = unit;
        this.harga = harga;
        this.notelp = notelp;
        this.Tanggalbooking = Tanggalbooking;
        this.email=email;
        this.nama=nama;
        this.password=password;
    }
   public Erlyan07183_AppartementAbstractEntity(){
       
   }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public Date getTanggalbooking() {
        return Tanggalbooking;
    }

    public void setTanggalbooking(Date Tanggalbooking) {
        this.Tanggalbooking = Tanggalbooking;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    
   
}
