import java.util.Scanner;
public class Pratikum3 {
    public static void main(String[] args){
        int jamKerja, ans, total;
        int denda = 0; int lembur = 0; int upah = 0;
        int Max = 60; int Min = 50;
        int gaji = 5000; int gajiLembur = 6000; int bayarDenda = 1000;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Jam Kerja : ");
        jamKerja = input.nextInt();
        
        if (jamKerja > Max){
            upah = Max * gaji; // upah pokok
            ans = jamKerja - Max; // cari selisih waktu lembur dan pokok
            lembur = ans * gajiLembur; // upah lembur
            total = upah + lembur;
        }
        else if( jamKerja >= Min && jamKerja <= Max){
            upah = jamKerja * gaji;
            total = upah;
        } 
        else {
           upah = jamKerja * gaji;
           ans = Min - jamKerja;
           denda = ans * bayarDenda;
           total = upah - denda;
         
        }
        
        System.out.printf("Upah\t = Rp. %d\nLembur\t = Rp. %d\nDenda\t = Rp. %d\n", upah, lembur, denda );
        System.out.println("---------------------");
        System.out.printf("Total\t = Rp. %d\n", total);
          
    }
}
