import java.util.Scanner;
public class Pratikum2 {
    public static void main (String[] args){
        int beratBadan;
        double tinggiBadan , IMT;
        String kategori = "";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Berat badan (kg): ");
        beratBadan = input.nextInt();
        System.out.print("Tinggi badan (m): ");
        tinggiBadan = input.nextDouble();
        
        if (tinggiBadan <= 0 && beratBadan <= 0) {
            System.out.println("Tinggi badan dan berat badan harus lebih dari 0");
            return;
           }
        
        IMT = beratBadan / Math.pow(tinggiBadan, 2);       
 
        if (IMT > 30){
            kategori = "Kegemukan";
        } else if ( IMT > 25 && IMT <= 30){
            kategori = "Gemuk";
        } else if ( IMT > 18.5 && IMT <= 25){
            kategori = "Normal";
        } else if (IMT <= 18.5) {
            kategori = "Kurus";
        } 
        
        System.out.printf("IMT = %.02f Termasuk %s" , IMT, kategori);
        
    }
}
