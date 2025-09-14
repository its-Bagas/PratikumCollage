
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Pratikum2 {
    public static void main (String[] args){
        String nama, kelurahan;
        int biayaBeban, PawalKwh, PakhirKwh ,Pjj;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program penghitung pemakaian listrik sederhana");
        System.out.print("Masukan Nama      : ");
        nama = input.nextLine();
        System.out.print("Masukan Kelurahan : ");
        kelurahan = input.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter  : ");
        PawalKwh = input.nextInt();
        System.out.print("Masukkan posisi akhir Khw Meter : ");
        PakhirKwh = input.nextInt();
        System.out.print("Masukkan biaya beban saat ini   : ");
        biayaBeban = input.nextInt();
        System.out.print("Masukkan PPJ (dalam persen)     : ");
        Pjj = input.nextInt();
        
        int selisihKwh = PakhirKwh - PawalKwh;
        int tarifListrik = selisihKwh * biayaBeban;
        double biayaPjj = tarifListrik * (Pjj / 100.0);
        double total = tarifListrik + biayaPjj;
        
     
        System.out.println("===================PLN Java===================");
        System.out.printf("Nama\t\t: %s%n", nama);
        System.out.printf("Kelurahan\t: %s%n", kelurahan);
        System.out.printf("Pemakaian bulan ini : %d " +  "Kwh Meter %n", selisihKwh );
        System.out.printf("Tarif Listrik\t: Rp %d,-%n", tarifListrik);
        System.out.printf("PJJ %d%% \t\t: Rp %.0f,-%n", Pjj, biayaPjj);
        System.out.printf("Total Bayar\t: Rp %.0f,-%n", total);
        System.out.println("==============================================");
        
        
    }
}
