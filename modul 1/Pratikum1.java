
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Pratikum1 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasiltambah, hasilkurang, hasilkali;
        double hasilbagi;
        
        System.out.print("masukan bilangan pertama : ");
        int a = input.nextInt();
        System.out.print("masukan bilangan kedua   : ");
        int b = input.nextInt();
        
        hasiltambah = a + b;
        hasilkurang = a - b;
        hasilkali   = a * b;
        hasilbagi   = (double) a / b; 

        System.out.printf("Hasil Penjumlahan : %d%n", hasiltambah);
        System.out.printf("Hasil Pengurangan : %d%n", hasilkurang);
        System.out.printf("Hasil Perkalian   : %d%n", hasilkali);
        System.out.printf("Hasil Pembagian   : %.1f%n", hasilbagi);
    }
}
