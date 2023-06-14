/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanmobil;
import java.util.ArrayList;

/**
 *
 * @author nuril
 */
public class Spesifikasi_Mobil {
   private ArrayList <Integer> Id_spek;
   private ArrayList <String> Id_mobil;
   private ArrayList <String> Warna;
   private ArrayList <String> Jenis_mesin;
   private ArrayList <String> BahanBakar;
   
   public Spesifikasi_Mobil (){
       Id_spek = new ArrayList <Integer> ();
       Id_mobil = new ArrayList <String> ();
       Warna = new ArrayList <String> ();
       Jenis_mesin = new ArrayList <String> ();
       BahanBakar = new ArrayList <String> ();    
   };
   
public void insertId_spek (Integer isi){
    this.Id_spek.add(isi);
}
public ArrayList <Integer> getRecordId_spek(){
    return this.Id_spek;
}

public void insertId_mobil (String isi){
    this.Id_mobil.add(isi);
}
public ArrayList <String> getRecordId_mobil(){
    return this.Id_mobil;
}

public void insertWarna (String isi){
    this.Warna.add(isi);
}
public ArrayList <String> getRecordWarna(){
    return this.Warna;
}

public void insertJenis_mesin (String isi){
    this.Jenis_mesin.add(isi);
}
public ArrayList <String> getRecordJenis_mesin(){
    return this.Jenis_mesin;
}

public void insertBahanBakar (String isi){
    this.BahanBakar.add(isi);
}
public ArrayList <String> getRecordBahanBakar(){
    return this.BahanBakar;
}
   
   
   
   
   
   
}
