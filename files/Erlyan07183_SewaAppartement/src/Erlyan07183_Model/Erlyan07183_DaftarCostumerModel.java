/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Erlyan07183_Model;

/**
 *
 * @author Acer
 */
import Entity.Erlyan07183_DaftarCostumer;
import Entity.Erlyan07183_Costumer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Erlyan07183_DaftarCostumerModel implements Erlyan07183_interfacesewa{
    private ArrayList<Erlyan07183_DaftarCostumer> erlyan07183_daftarpelangganArrayList;
    
    public Erlyan07183_DaftarCostumerModel(){
        erlyan07183_daftarpelangganArrayList=new ArrayList<Erlyan07183_DaftarCostumer>();
    }
    public void Erlyan07183_insertDaftar(Erlyan07183_DaftarCostumer erlyan07183_DaftarCostumer){
        erlyan07183_daftarpelangganArrayList.add(erlyan07183_DaftarCostumer);
    }
    public ArrayList<Erlyan07183_DaftarCostumer> getErlyan07183_daftarpelangganArrayList(){
        return erlyan07183_daftarpelangganArrayList;
    }
    
    @Override
    
    public void views07183(){
        for(Erlyan07183_DaftarCostumer erlyan07183_DaftarCostumer : erlyan07183_daftarpelangganArrayList){
            System.out.println("=================================================");
            System.out.println(" Email : "+erlyan07183_DaftarCostumer.getPelanggan().getEmail()+"\n Nama : "
                    +erlyan07183_DaftarCostumer.getPelanggan()+"\n Password"+erlyan07183_DaftarCostumer.getPelanggan().getPassword()
                    +"\n No.Telp"+erlyan07183_DaftarCostumer.getPelanggan().getNotelp()+"\n Tanggal Booking"+erlyan07183_DaftarCostumer.getPelanggan().getTanggalbooking());
            System.out.println("=================================================");
            if(erlyan07183_DaftarCostumer.isIsVerified() == false){
                System.out.println("Belum Di Verifikasi Admin");
            }else{
                System.out.println("Telah Di Verifikasi");
            }
        }
    }
     public int ceksewa(String email, String password){
        int loop = 0;
        if (erlyan07183_daftarpelangganArrayList.size() ==0) {
            loop = -1;//data kosong
        } else {
                for (int i = 0; i < erlyan07183_daftarpelangganArrayList.size(); i++) {
                if (erlyan07183_daftarpelangganArrayList.get(i).getPelanggan().getEmail().equals(email)) {
                    loop = i;
                    break;
                } else {
                    loop = -2;
                }
            }
        }return loop;
    }
    public Erlyan07183_DaftarCostumer showDaftarCostumer(int index){
        return erlyan07183_daftarpelangganArrayList.get(index);
    }
    public void updateIsVerified(int index , Erlyan07183_DaftarCostumer Erlyan07183_tamu){
        erlyan07183_daftarpelangganArrayList.set(index,Erlyan07183_tamu);
    }

    
}
