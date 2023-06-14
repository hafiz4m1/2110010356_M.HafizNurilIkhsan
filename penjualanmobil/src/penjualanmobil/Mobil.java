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
public class Mobil {
    private ArrayList <Integer> Id_mobil;
    private ArrayList <Integer> Id_jenis;
    private ArrayList <String> Nama_mobil;
    
public Mobil (){
    Id_mobil = new ArrayList <Integer>();
    Id_jenis = new ArrayList <Integer>();
    Nama_mobil = new ArrayList <String>();
};

public void insertId_mobil (Integer isi){
    this.Id_mobil.add(isi);
}
public ArrayList <Integer> getRecordId_mobil(){
    return this.Id_mobil;
}

public void insertId_jenis (Integer isi){
    this.Id_jenis.add(isi);
}
public ArrayList <Integer> getRecordId_jenis(){
    return this.Id_jenis;
}
public void insertNama_mobil(String isi){
    this.Nama_mobil.add(isi);
}
public ArrayList <String> getRecordNama_mobil(){
    return this.Nama_mobil;
}
}
