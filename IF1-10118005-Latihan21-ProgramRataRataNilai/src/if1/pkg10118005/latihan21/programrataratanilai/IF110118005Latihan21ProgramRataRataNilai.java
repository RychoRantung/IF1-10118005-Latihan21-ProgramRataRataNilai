/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program :Program berisi program yang menampilkan rata-rata nilai dari mahasiswa
 */
public class IF110118005Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Banyak Mahasiswa : ");
        int mahasiswa = sc.nextInt();
        double nilai = 0;
        double rata = 0;
        int i = 1;
        
        while (i <= mahasiswa){
            System.out.print("Nilai Mahasiswa Ke-" + i++ +": ");
            nilai = sc.nextDouble();
            rata = rata + nilai;
            
        }
        rata = rata / mahasiswa;
        System.out.println("Maka, rata-rata nilainya adalah " +rata);
        
    }
    
}
