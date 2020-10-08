/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class NilaiHuruf {
    public static void main (String[] args){
        int Nilai = 73;
        if(Nilai < 0 || Nilai > 100) {
            System.out.println("Error");
        }
        else if(Nilai >= 0 && Nilai <=55) {
            System.out.println("E");
        } else if(Nilai >= 56 && Nilai <=65) {
            System.out.println("D");
        } else if(Nilai >= 66 && Nilai <=75) {
            System.out.println("C");
        } else if(Nilai >= 76 && Nilai <=85) {
            System.out.println("B");
        }
    }
}
