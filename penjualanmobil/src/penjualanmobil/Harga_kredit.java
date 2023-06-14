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
public class Harga_kredit {
       private ArrayList <Integer> Id_kredit;
   private ArrayList <Integer> Id_mobil;
   private ArrayList <Integer> Uang_muka;
   
   public Harga_kredit (){
       Id_kredit = new ArrayList <Integer> ();
       Id_mobil = new ArrayList <Integer> ();
       Uang_muka = new ArrayList <Integer> ();
   }
   
   
public void insertId_kredit (Integer isi){
    this.Id_kredit.add(isi);
}
public ArrayList <Integer> getRecordId_kredit(){
    return this.Id_kredit;
}

public void insertId_mobil (Integer isi){
    this.Id_mobil.add(isi);
}
public ArrayList <Integer> getRecordId_mobil(){
    return this.Id_mobil;
}

public void insertUang_muka (Integer isi){
    this.Uang_muka.add(isi);
}
public ArrayList <Integer> getRecordUang_muka(){
    return this.Uang_muka;
}
    
}
