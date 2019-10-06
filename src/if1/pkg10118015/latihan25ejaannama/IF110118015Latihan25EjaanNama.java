/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan25ejaannama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program mengeja nama
 */
public class IF110118015Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan Nama Depan Untuk Di Eja : ");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        System.out.println();
        char ejaan[] = nama.toCharArray();
        System.out.println("Ejaan untuk \""+nama+"\" adalah :");
        for (int i = 0; i < ejaan.length; i++) {
            System.out.println("Huruf Ke-"+(i+1)+" : "+ejaan[i]);
        }
    }
    
}
