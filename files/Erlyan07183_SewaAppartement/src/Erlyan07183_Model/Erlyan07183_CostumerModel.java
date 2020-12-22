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
import Entity.Erlyan07183_Costumer;
import java.util.ArrayList;
public class Erlyan07183_CostumerModel implements Erlyan07183_interfacesewa{
    private ArrayList<Erlyan07183_Costumer> erlyan07183_pelangganArrayList;
    
    public Erlyan07183_CostumerModel(){
        erlyan07183_pelangganArrayList=new ArrayList<Erlyan07183_Costumer>();
    }
    public void Erlyan07183_insert(Erlyan07183_Costumer erlyan07183_Costumer){
        erlyan07183_pelangganArrayList.add(erlyan07183_Costumer);
    }
    
    @Override
    public void views07183(){
        for(Erlyan07183_Costumer erlyan07183_Costumer : erlyan07183_pelangganArrayList){
            System.out.println("=================================================");
            System.out.println(" Email : "+erlyan07183_Costumer.getEmail()+"\n Nama : "
                    +erlyan07183_Costumer.getNama()+"\n Password"+erlyan07183_Costumer.getPassword()
                    +"\n No.Telp"+erlyan07183_Costumer.getNotelp()+"\n Tanggal Booking"+erlyan07183_Costumer.getTanggalbooking());
            System.out.println("=================================================");
        }
    }
    public int ceksewa(String email, String password){
        int loop = 0;
        while (!erlyan07183_pelangganArrayList.get(loop).getEmail().equals(email) && !erlyan07183_pelangganArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    public Erlyan07183_Costumer getErlyan07183_pelangganArrayList(int index){
        return erlyan07183_pelangganArrayList.get(index);
    }

/*    @Override
    public void views07183() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ceksewa(String unit, String waktu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}
