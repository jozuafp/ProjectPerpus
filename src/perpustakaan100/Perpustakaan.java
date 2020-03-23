/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan100;

/**
 *
 * @author JW
 */
public class Perpustakaan {
    String Kode;
    String Judul;
    String Pengarang;
    int Harga;
    
    public Perpustakaan(String Kode, String Judul, String Pengarang, int Harga){
        this.Kode = Kode;
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Harga = Harga;
    }
    public void List(){
        System.out.println("Kode : "+this.Kode);
        System.out.println("Judul : "+this.Judul);
        System.out.println("Pengarang : "+this.Pengarang);
        System.out.println("Harga : "+this.Harga);
    }
}
