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
public class Erlyan07183_DaftarCostumer {
    private Erlyan07183_Costumer pelanggan;
    private boolean isVerified;
    private int indexappart;

    public Erlyan07183_DaftarCostumer(Erlyan07183_Costumer pelanggan, boolean isVerified, int indexappart) {
        this.pelanggan = pelanggan;
        this.isVerified = isVerified;
        this.indexappart = indexappart;
    }

    public Erlyan07183_Costumer getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Erlyan07183_Costumer pelanggan) {
        this.pelanggan = pelanggan;
    }

    public boolean isIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public int getIndexappart() {
        return indexappart;
    }

    public void setIndexappart(int indexappart) {
        this.indexappart = indexappart;
    }
    

}
