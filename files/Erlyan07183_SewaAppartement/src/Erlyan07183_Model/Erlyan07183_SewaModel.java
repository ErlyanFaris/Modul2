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
import Entity.Erlyan07183_SewaEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Erlyan07183_SewaModel implements Erlyan07183_interfacesewa{
    private  ArrayList<Erlyan07183_SewaEntity> erlyan07183_sewaEntityArrayList;
    
    public Erlyan07183_SewaModel(){
        erlyan07183_sewaEntityArrayList = new ArrayList<Erlyan07183_SewaEntity>();
    }
    public void insertSewa(Erlyan07183_SewaEntity sewa) {
        erlyan07183_sewaEntityArrayList.add(sewa);
    }
    @Override
    public void views07183() {
        for(Erlyan07183_SewaEntity sewaEntity : erlyan07183_sewaEntityArrayList) {
            System.out.print(sewaEntity.getEmail());
            System.out.print(sewaEntity.getNama());
            System.out.print(sewaEntity.getPassword());
            System.out.print(sewaEntity.getNotelp());
            System.out.print(new SimpleDateFormat("dd-MM-yyyy").format(sewaEntity.getTanggalbooking()));
            System.out.println();
        }
    }

    public int ceksewa(String email, String password) {
        int loop = 0;
        for(Erlyan07183_SewaEntity sewaEntity : erlyan07183_sewaEntityArrayList) {
            if(sewaEntity.getEmail().equals(email) && sewaEntity.getPassword().equals(password)){
                break;
            }else{
                loop++;
            }
        }
        return loop;
    }
    public Erlyan07183_SewaEntity showDataSewa(int index){
        return erlyan07183_sewaEntityArrayList.get(index);
    }
}

