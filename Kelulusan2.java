
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
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
public class Kelulusan2 {
    public static void main(String[] args) {
        //Buat scanner
        Scanner inp = new Scanner(System.in);
        int Tinggi = 150;
        
        //Nama
        System.out.print("Masukan Nama Anda : ");
        String Nama = inp.nextLine();
        
        //Jenis Kelamin
        System.out.print("Masukan Jenis Kelamin Anda : ");
        String Jenis_Kelamin = inp.nextLine();
        
        //Tinggi Badan
        System.out.print("Masukan Tinggi Badan Anda : ");
        Tinggi = inp.nextInt();
        
       //print
        if("laki laki".equals(Jenis_Kelamin)){
             if(Tinggi >=171) {
                 System.out.println("Selamat Anda Lulus");
             } else {
                 System.out.println("Anda Gagal");
             }
        } else if("perempuan".equals(Jenis_Kelamin)) {
                if(Tinggi >=161) {
                   System.out.println("Selamat Anda Lulus");
                } else {
                    System.out.println("Anda Gagal");
                }
        }  
    }  
}
