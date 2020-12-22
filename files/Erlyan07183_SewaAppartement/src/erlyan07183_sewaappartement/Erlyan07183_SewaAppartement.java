package erlyan07183_sewaappartement;

import Entity.Erlyan07183_Costumer;
import Entity.Erlyan07183_DaftarCostumer;
import Entity.Erlyan07183_SewaEntity;
import Entity.Erlyan07183_appart;
import Erlyan07183_Model.Erlyan07183_SewaModel;;
import Erlyan07183_Model.Erlyan07183_CostumerModel;
import Erlyan07183_Model.Erlyan07183_DaftarCostumerModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Erlyan07183_SewaAppartement{
    private static Erlyan07183_SewaModel sewaModel = new Erlyan07183_SewaModel();
    private static Scanner input = new Scanner(System.in);
    private static Erlyan07183_CostumerModel costumerModel = new Erlyan07183_CostumerModel();
    private static Erlyan07183_DaftarCostumerModel daftarcostumerModel = new Erlyan07183_DaftarCostumerModel();
    private static int pilpelanggan;
    static int cekCostumer;
    static int cekSewa;
    public static void main(String[] args) {
    int loop=0;
        dataSewa();
        do{
            int pilih = 0;
            System.out.print("Selamat Datang Di Sewa APPARTEMENT !!"+
                    "\n 1. Login"+
                    "\n 2. Daftar Pelanggan"+
                    "\n 0. Stop"+
                    "\n Masukkan Pilihan Anda : ");
            pilih = input.nextInt();
            if (pilih == 1) {
                int pilLogin = 0;
                System.out.print("1. Login Admin" + "\n2. Login Pelanggan" + "\nPilih : ");
                pilLogin = input.nextInt();
                if (pilLogin == 1) {
                    loginAdmin();
                } else {
                    login();
                }
            }else if (pilih == 2) {
                register();
            } else if(pilih == 3) {
                sewaModel.views07183();
            }else if(pilih == 4){
                
            }else{
                break;
            }
        }while (loop!=1);
    }
    static void dataSewa(){
        String email [] = {"01","02","03","04","05","06","07"};
        String password [] = {"01","02","03","04","05","06","07"};
        String nama [] = {"Michael","Alan","Odil","Fitria","Sita","Eric","Fernanda"};
        String notelp [] = {"01","02","03","04","05","06","07"};
        String Tanggalbooking [] = {"04/05/2000","01/12/2000","03/3/2000","23/6/2000","11/7/2000","13/9/2000","22/12/2000"};
        String kamar [] = {"spesial", "king bed", "singgel bed", "double bed"};
        String harga [] = {"500000","600000","500000","600000","500000","600000","500000"};
        for (int i = 0; i < email.length; i++) {
            sewaModel.insertSewa(new Erlyan07183_SewaEntity(password[i],nama[i],email[i],
                    kamar[i],harga[i],notelp[i],new Date(Tanggalbooking[i])));
        }
    }
    
    static void register(){
        System.out.print("Input EMAIL = ");
        String email = input.next();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String pass = input.next();
        System.out.print("Input No Telp = ");
        String notelp = input.next();
        System.out.print("Input Tgl booking mm/dd/yyyy = ");
        String tanggal = input.next();
        System.out.print("Kamar = ");
        String kamar = input.next();
        System.out.println("unit = ");
        String unit = input.next();
        costumerModel.Erlyan07183_insert(new Erlyan07183_Costumer(pass,nama,email,kamar,unit,"0",notelp,new Date(tanggal)));
    }
    static void login(){
        System.out.print("EMAIL : ");
        String email = input.next();
        System.out.print("Password : ");
        String password = input.next();
        cekCostumer = costumerModel.ceksewa(email,password);
        System.out.println("Selamat Datang "+costumerModel.getErlyan07183_pelangganArrayList(cekCostumer).getNama());
        int cekappart = daftarcostumerModel.ceksewa(email,password);
        if (cekappart == -1) {
            System.out.println("Anda Belum Menyewa APPARTEMENT");
            daftarpel();
        } else if(cekappart == -2){
            System.out.println("Anda Belum Menyewa APPARTEMENT");
            daftarpel();
        }else {
            System.out.println("Nama = "+daftarcostumerModel.showDaftarCostumer(cekCostumer).getPelanggan().getNama());
            System.out.println("EMAIL = "+daftarcostumerModel.showDaftarCostumer(cekCostumer).getPelanggan().getEmail());
            System.out.println("No Telp = "+daftarcostumerModel.showDaftarCostumer(cekCostumer).getPelanggan().getNotelp());
            System.out.println("UNIT = "+daftarcostumerModel.showDaftarCostumer(cekCostumer).getPelanggan().getUnit());
            System.out.println("isVerified = "+daftarcostumerModel.showDaftarCostumer(cekCostumer).isIsVerified());
        }
    }
    static void daftarpel(){
        System.out.println("Pilih APPARTEMENT");
        for (int i = 0; i < Erlyan07183_appart.appart.length; i++) {
            System.out.println(i+". "+Erlyan07183_appart.appart[i]);
        }
        System.out.print("Pilih appart = ");
        pilpelanggan = input.nextInt();
        daftarcostumerModel.Erlyan07183_insertDaftar(new Erlyan07183_DaftarCostumer(costumerModel.getErlyan07183_pelangganArrayList(cekCostumer),false,pilpelanggan));
    }
    static void loginAdmin(){
        System.out.print("EMAIL : ");
        String email = input.next();
        System.out.print("Password : ");
        String password = input.next();
        cekSewa = sewaModel.ceksewa(email,password);
        
        System.out.println("Selamat Datang "+sewaModel.showDataSewa(cekSewa).getNama());
        costumerModel.views07183();
        updateIsVerified();
    }
    static void updateIsVerified(){
        System.out.print("EMAIL PELANGGAN = ");
        String email = input.next();
        int index = daftarcostumerModel.ceksewa(email,null);
        daftarcostumerModel.updateIsVerified(index, new Erlyan07183_DaftarCostumer(costumerModel.getErlyan07183_pelangganArrayList(cekCostumer),true,pilpelanggan));
    }    
    
}
      
        