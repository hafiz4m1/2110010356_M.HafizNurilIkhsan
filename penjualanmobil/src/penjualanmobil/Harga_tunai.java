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
public class Harga_tunai {
    
    private ArrayList <Integer> Id_harga;
    private ArrayList <String> Id_mobil;
    private ArrayList <Integer> Harga_Tunai;
    
    public Harga_tunai (){
        
        Id_harga = new ArrayList <Integer> ();
        Id_mobil = new ArrayList <String> ();
        Harga_Tunai = new ArrayList <Integer> (); 
    };
    
    public void insertId_harga (Integer isi){
        this.Id_harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordId_harga (){
        return this.Id_harga;
    }
    
    public void insertId_mobil (String isi){
        this.Id_mobil.add(isi);
    }
    
    public ArrayList <String> getRecordId_mobil (){
        return this.Id_mobil;
    }
    
    public void insertHarga_Tunai (Integer isi){
        this.Harga_Tunai.add(isi);
    }
    
    public ArrayList <Integer> getRecordHarga_Tunai (){
        return this.Harga_Tunai;
    }
} 
