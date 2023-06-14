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
public class Jenis_Mobil {
    private ArrayList <Integer> Id_jenis;
    private ArrayList <String> Nama_jenis;
    
public Jenis_Mobil (){
    Id_jenis = new ArrayList <Integer>();
    Nama_jenis = new ArrayList <String>();
};

public void insertId_jenis (Integer isi){
    this.Id_jenis.add(isi);
}

public ArrayList <Integer> getRecordId_jenis(){
    return this.Id_jenis;
}

public void insertNama_jenis(String isi){
    this.Nama_jenis.add(isi);
}

public ArrayList <String> getRecordNama_jenis(){
    return this.Nama_jenis;
}
}
