

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Kelulusan1 {
 public static void main(String[] args) {
     // Buat Scanner
     Scanner inp = new Scanner(System.in);
     int Nilai = 0;

     
     // Ambil Nama
     System.out.print("Masukkan nama anda = ");
     String Nama = inp.nextLine();

     // Ambil NIM
     System.out.print("Masukkan NIM = ");
     String nim = inp.nextLine();

     // Ambil Nilai
     System.out.print("Masukkan Nilai = ");
     int nilai = inp.nextInt();

     // Print
     if(Nilai >=75){
         System.out.println("Selamat Anda Lulus");
     } else{
         System.out.println("Anda Tidak Lulus");
     }
 }
}

    

