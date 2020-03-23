/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan100;

import java.util.Scanner;

/**
 *
 * @author JW
 */
public class Perpustakaan100 {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {        
        Perpustakaan[] Perpus = new Perpustakaan[10];
        int Pilihan=0;
        int Count=-1;
        String Kode;
        String Judul;
        String Pengarang;
        int Harga;
        Scanner InputString = new Scanner(System.in);
        Scanner InputNum = new Scanner(System.in);
        while(Pilihan!=3){
            System.out.print("Menu:\n1.Input\n2.List\n3.Exit\nPilihan: ");
            Pilihan = InputNum.nextInt();
            switch (Pilihan)
            {
                case 1:
                    Count++;
                    System.out.println("Masukkan data");
                    System.out.print("Kode: "); Kode = InputString.nextLine();
                    System.out.print("Judul: "); Judul = InputString.nextLine();
                    System.out.print("Pengarang: "); Pengarang = InputString.nextLine();
                    System.out.print("Harga: "); Harga = InputNum.nextInt();
                    Perpus[Count] = new Perpustakaan(Kode, Judul, Pengarang, Harga);
                    break;
                case 2:
                    if (Count<0)
                    {
                        System.out.println("Belum ada data.");
                    }
                    else
                    {
                        int Temp = 0;
                        while(Temp<=Count)
                        {
                            System.out.println("Data ke-"+(Temp+1));
                            Perpus[Temp].List();
                            Temp++;
                        }   
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
            
        }
    }
}