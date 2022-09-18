/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.util.Scanner;

/**
 *
 * @author MSI GF63
 */

class Instruksi{
    private int tetesan, waktu, cairan;
    private float hasil;
    
    public void setCairan(int cairan){
        this.cairan = cairan;
    }
    public int getCairan(){
        return cairan;
    }
    
    public void setWaktu(int waktu){
        this.waktu = waktu;
    }
    public int getWaktu(){
        return waktu;
    }
    
    public void setTetesan(int tetesan){
        this.tetesan = tetesan;
    }
    public int getTetesan(){
        return tetesan;
    }
    
    public void setHasil(int cairan, int waktu, int tetesan){
        this.hasil = (float) (cairan * tetesan) / (60 * waktu);
    }
    public float getHasil(){
        return hasil;
    }
    
    public void tampil(String a){
        System.out.println(a);
    }
    public void tampil(float a){
        System.out.println("Hasil : " + a);
    }
    
    
}

public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Instruksi ob = new Instruksi();
        int cairan, waktu, tetesan;
        
        ob.tampil("Masukkan banyak cairan : ");
        cairan = input.nextInt();
        ob.setCairan(cairan);
        
        ob.tampil("Masukkan lama waktu : ");
        waktu = input.nextInt();
        ob.setWaktu(waktu);
        
        ob.tampil("Masukkan banyak tetesan : ");
        tetesan = input.nextInt();
        ob.setTetesan(tetesan);
        
        ob.setHasil(ob.getCairan(), ob.getWaktu(), ob.getTetesan());
        ob.tampil(ob.getHasil());
    }
}
